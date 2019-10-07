package kihons;

import framework.Item;
import framework.bases.StreamsKihonBase;
import framework.exceptions.NotImplementedYetException;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamKihon extends StreamsKihonBase {

    @Override
    protected List<String> getTheNamesOfAllItems(List<Item> items) {
        return items.stream().map(i -> i.getName()).collect(Collectors.toList());
    }

    @Override
    protected List<Item> sortItemsAlphabeticallyBasedOnName(List<Item> items) {
       return items.stream().map(i ->i.getName()).sorted().collect(Collectors.toList(Item));
    }

    @Override
    protected List<Item> sortOnCostFromLestToMostExpensiveAllItemsThatCostLessThanOrEqualToMyMonies(List<Item> items, int monies) {
       items.stream().sorted(Comparator.comparing(monies, )).
    }

    @Override
    protected Item getTheItemWithTheMostCost(List<Item> items) {
        throw new NotImplementedYetException();
    }

    @Override
    protected int getTheAverageCostRoundedDown(List<Item> items) {
        throw new NotImplementedYetException();
    }

    @Override
    protected void addAllItemsToMyMapWIthKetNameAndValueOfCost(List<Item> items, Map<String, Integer> myMap) {
        throw new NotImplementedYetException();
    }
}
