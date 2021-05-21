package com.example.myastrocode5.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.myastrocode5.R;


public class ExpandableListMain2 extends Fragment {

//    private int ParentClickStatus = -1;
//    private int ChildClickStatus = -1;
//    private ArrayList<ExpandableListMain.Parent> parents;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.grouprow, container, false);
        return view;

    }
}
//
//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//
//        final ArrayList<ExpandableListMain.Parent> dummyList = buildDummyData();
//        // Adding ArrayList data to ExpandableListView values
//        loadHosts(dummyList);
//    }
//
//
//
//    private ArrayList<ExpandableListMain.Parent> buildDummyData() {
//        // Creating ArrayList of type parent class to store parent class objects
//        final ArrayList<ExpandableListMain.Parent> list = new ArrayList<ExpandableListMain.Parent>();
//        for (int i = 1; i < 3; i++) {
//            //Create parent class object
//            final ExpandableListMain.Parent parent = new ExpandableListMain.Parent();
//
//            // Set values in parent class object
//            if (i == 1) {
//                parent.setName("" + i);
//                parent.setText1("Личный календарь");
//                parent.setChildren(new ArrayList<ExpandableListMain.Child>());
//
//                // Create Child class object
//                final ExpandableListMain.Child child = new ExpandableListMain.Child();
//                child.setName("" + i);
//                parent.getChildren().add(child);
//            } else if (i == 2) {
//                parent.setName("" + i);
//                parent.setText1("Общая обстановка");
//                parent.setChildren(new ArrayList<ExpandableListMain.Child>());
//
//                final ExpandableListMain.Child child = new ExpandableListMain.Child();
//                child.setName("" + i);
//                parent.getChildren().add(child);
//            }
////            Adding Parent class object to ArrayList
//            list.add(parent);
//        }
//        return list;
//    }
//
//    private void loadHosts(final ArrayList<ExpandableListMain.Parent> newParents) {
//        if (newParents == null)
//            return;
//        parents = newParents;
//
//
//        // Check for ExpandableListAdapter object
//        if (this.getExpandableListAdapter() == null) {
//            //Create ExpandableListAdapter Object
//            final ExpandableListMain.MyExpandableListAdapter mAdapter = new ExpandableListMain.MyExpandableListAdapter();
//
//            // Set Adapter to ExpandableList Adapter
//            this.setListAdapter(mAdapter);
//        } else {
//            // Refresh ExpandableListView data
//            ((ExpandableListMain.MyExpandableListAdapter) getExpandableListAdapter()).notifyDataSetChanged();
//        }
//    }
//
//    private class MyExpandableListAdapter extends BaseExpandableListAdapter {
//
//    private final LayoutInflater inflater;
//
//    public MyExpandableListAdapter() {
//        // Create Layout Inflator
//        inflater = LayoutInflater.from(ExpandableListMain.this.getContext());
//    }
//    // This Function used to inflate parent rows view
//
//    @Override
//    public View getGroupView(int groupPosition, boolean isExpanded,
//                             View convertView, ViewGroup parentView) {
//        final ExpandableListMain.Parent parent = parents.get(groupPosition);
//
//        // Inflate grouprow.xml file for parent rows
//        convertView = inflater.inflate(R.layout.grouprow, parentView, false);
//
//        // Get grouprow.xml file elements and set values
//        ((TextView) convertView.findViewById(R.id.textgroup)).setText(parent.getText1());
//
//        ImageView image = (ImageView) convertView.findViewById(R.id.image);
//
//        return convertView;
//    }
//
//    // This Function used to inflate child rows view
//    @Override
//    public View getChildView(int groupPosition, int childPosition, boolean isLastChild,
//                             View convertView, ViewGroup parentView) {
//        final ExpandableListMain.Parent parent = parents.get(groupPosition);
//        final ExpandableListMain.Child child = parent.getChildren().get(childPosition);
//
//        // Inflate childrow.xml file for child rows
//        convertView = inflater.inflate(R.layout.childrow, parentView, false);
//
//        // Get childrow.xml file elements and set values
//        return convertView;
//    }
//
//    @Override
//    public Object getChild(int groupPosition, int childPosition) {
//        return parents.get(groupPosition).getChildren().get(childPosition);
//    }
//
//    //Call when child row clicked
//    @Override
//    public long getChildId(int groupPosition, int childPosition) {
//        return childPosition;
//    }
//
//    @Override
//    public int getChildrenCount(int groupPosition) {
//        int size = 0;
//        if (parents.get(groupPosition).getChildren() != null)
//            size = parents.get(groupPosition).getChildren().size();
//        return size;
//    }
//
//    @Override
//    public Object getGroup(int groupPosition) {
//        return parents.get(groupPosition);
//    }
//
//    @Override
//    public int getGroupCount() {
//        return parents.size();
//    }
//
//    //Call when parent row clicked
//    @Override
//    public long getGroupId(int groupPosition) {
//        return groupPosition;
//    }
//
//    @Override
//    public void notifyDataSetChanged() {
//        // Refresh List rows
//        super.notifyDataSetChanged();
//    }
//
//    @Override
//    public boolean isEmpty() {
//        return ((parents == null) || parents.isEmpty());
//    }
//
//    @Override
//    public boolean isChildSelectable(int groupPosition, int childPosition) {
//        return true;
//    }
//
//    @Override
//    public boolean hasStableIds() {
//        return true;
//    }
//
//    @Override
//    public boolean areAllItemsEnabled() {
//        return true;
//    }
//
//}
//
//public class Child {
//    private String name;
//    private String text1;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getText1() {
//        return text1;
//    }
//
//    public void setText1(String text1) {
//        this.text1 = text1;
//    }
//
//}
//
//public class Parent {
//
//    private String name;
//    private String text1;
//
//    // ArrayList to store child objects
//    private ArrayList<ExpandableListMain.Child> children;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getText1() {
//        return text1;
//    }
//
//    public void setText1(String text1) {
//        this.text1 = text1;
//    }
//
//    // ArrayList to store child objects
//    public ArrayList<ExpandableListMain.Child> getChildren() {
//        return children;
//    }
//
//    public void setChildren(ArrayList<ExpandableListMain.Child> children) {
//        this.children = children;
//    }
//}
//
//}
