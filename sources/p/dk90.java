package p;

import androidx.car.app.model.CarText;
import androidx.car.app.model.ItemList;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dk90 {
    public final ArrayList a;
    public final int b;
    public final c8q0 c;
    public final k5q0 d;
    public CarText e;

    public dk90(ItemList itemList) {
        this.b = itemList.getSelectedIndex();
        this.c = itemList.getOnSelectedDelegate();
        this.d = itemList.getOnItemVisibilityChangedDelegate();
        this.e = itemList.getNoItemsMessage();
        this.a = new ArrayList(itemList.getItems());
    }

    public final ItemList a() {
        if (this.c != null) {
            ArrayList<qi90> arrayList = this.a;
            int size = arrayList.size();
            if (size == 0) {
                eg.m("A selectable list cannot be empty");
                return null;
            }
            int i = this.b;
            if (i >= size) {
                eg.m(l1d.j(i, size, "The selected item index (", ") is larger than the size of the list (", ")"));
                return null;
            }
            for (qi90 qi90Var : arrayList) {
                if (ItemList.getOnClickDelegate(qi90Var) != null) {
                    eg.m("Items that belong to selectable lists can't have an onClickListener. Use the OnSelectedListener of the list instead");
                    return null;
                }
                if (ItemList.getToggle(qi90Var) != null) {
                    eg.m("Items that belong to selectable lists can't have a toggle");
                    return null;
                }
            }
        }
        return new ItemList(this);
    }

    public dk90() {
        this.a = new ArrayList();
    }
}
