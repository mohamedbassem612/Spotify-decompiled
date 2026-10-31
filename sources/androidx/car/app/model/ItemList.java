package androidx.car.app.model;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p.c8q0;
import p.dk90;
import p.e2q0;
import p.e4p1;
import p.gvg;
import p.k5q0;
import p.qi90;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class ItemList {
    private final List<qi90> mItems;
    private final CarText mNoItemsMessage;
    private final k5q0 mOnItemVisibilityChangedDelegate;
    private final c8q0 mOnSelectedDelegate;
    private final int mSelectedIndex;

    public ItemList(dk90 dk90Var) {
        this.mSelectedIndex = dk90Var.b;
        this.mItems = e4p1.w(dk90Var.a);
        this.mNoItemsMessage = dk90Var.e;
        this.mOnSelectedDelegate = dk90Var.c;
        this.mOnItemVisibilityChangedDelegate = dk90Var.d;
    }

    public static e2q0 getOnClickDelegate(qi90 qi90Var) {
        if (qi90Var instanceof Row) {
            return ((Row) qi90Var).getOnClickDelegate();
        }
        if (qi90Var instanceof GridItem) {
            return ((GridItem) qi90Var).getOnClickDelegate();
        }
        return null;
    }

    public static Toggle getToggle(qi90 qi90Var) {
        if (qi90Var instanceof Row) {
            return ((Row) qi90Var).getToggle();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemList)) {
            return false;
        }
        ItemList itemList = (ItemList) obj;
        if (this.mSelectedIndex == itemList.mSelectedIndex && Objects.equals(this.mItems, itemList.mItems)) {
            if (Boolean.valueOf(this.mOnSelectedDelegate == null).equals(Boolean.valueOf(itemList.mOnSelectedDelegate == null))) {
                if (Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null).equals(Boolean.valueOf(itemList.mOnItemVisibilityChangedDelegate == null)) && Objects.equals(this.mNoItemsMessage, itemList.mNoItemsMessage)) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<qi90> getItems() {
        List<qi90> list = this.mItems;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public CarText getNoItemsMessage() {
        return this.mNoItemsMessage;
    }

    public k5q0 getOnItemVisibilityChangedDelegate() {
        return this.mOnItemVisibilityChangedDelegate;
    }

    public c8q0 getOnSelectedDelegate() {
        return this.mOnSelectedDelegate;
    }

    public int getSelectedIndex() {
        return this.mSelectedIndex;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mSelectedIndex), this.mItems, Boolean.valueOf(this.mOnSelectedDelegate == null), Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null), this.mNoItemsMessage);
    }

    public dk90 toBuilder() {
        return new dk90(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ items: ");
        List<qi90> list = this.mItems;
        sb.append(list != null ? list.toString() : null);
        sb.append(", selected: ");
        return gvg.j(sb, this.mSelectedIndex, "]");
    }

    private ItemList() {
        this.mSelectedIndex = 0;
        this.mItems = Collections.EMPTY_LIST;
        this.mNoItemsMessage = null;
        this.mOnSelectedDelegate = null;
        this.mOnItemVisibilityChangedDelegate = null;
    }
}
