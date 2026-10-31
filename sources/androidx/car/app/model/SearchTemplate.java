package androidx.car.app.model;

import java.util.Objects;
import p.aw41;
import p.pb51;
import p.qrd;
import p.sxd1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class SearchTemplate implements sxd1 {
    private final ActionStrip mActionStrip;
    private final Action mHeaderAction;
    private final String mInitialSearchText;
    private final boolean mIsLoading;
    private final ItemList mItemList;
    private final aw41 mSearchCallbackDelegate;
    private final String mSearchHint;
    private final boolean mShowKeyboardByDefault;

    public SearchTemplate(pb51 pb51Var) {
        this.mInitialSearchText = pb51Var.b;
        this.mSearchHint = pb51Var.c;
        this.mIsLoading = false;
        this.mItemList = pb51Var.d;
        this.mSearchCallbackDelegate = pb51Var.a;
        this.mShowKeyboardByDefault = pb51Var.e;
        this.mHeaderAction = pb51Var.f;
        this.mActionStrip = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchTemplate)) {
            return false;
        }
        SearchTemplate searchTemplate = (SearchTemplate) obj;
        return this.mIsLoading == searchTemplate.mIsLoading && Objects.equals(this.mInitialSearchText, searchTemplate.mInitialSearchText) && Objects.equals(this.mSearchHint, searchTemplate.mSearchHint) && Objects.equals(this.mItemList, searchTemplate.mItemList) && Objects.equals(this.mHeaderAction, searchTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, searchTemplate.mActionStrip) && this.mShowKeyboardByDefault == searchTemplate.mShowKeyboardByDefault;
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public String getInitialSearchText() {
        return this.mInitialSearchText;
    }

    public ItemList getItemList() {
        return this.mItemList;
    }

    public aw41 getSearchCallbackDelegate() {
        aw41 aw41Var = this.mSearchCallbackDelegate;
        Objects.requireNonNull(aw41Var);
        return aw41Var;
    }

    public String getSearchHint() {
        return this.mSearchHint;
    }

    public int hashCode() {
        return Objects.hash(this.mInitialSearchText, Boolean.valueOf(this.mIsLoading), this.mSearchHint, this.mItemList, Boolean.valueOf(this.mShowKeyboardByDefault), this.mHeaderAction, this.mActionStrip);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public boolean isShowKeyboardByDefault() {
        return this.mShowKeyboardByDefault;
    }

    public String toString() {
        return "SearchTemplate";
    }

    private SearchTemplate() {
        this.mInitialSearchText = null;
        this.mSearchHint = null;
        this.mIsLoading = false;
        this.mItemList = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mSearchCallbackDelegate = null;
        this.mShowKeyboardByDefault = true;
    }
}
