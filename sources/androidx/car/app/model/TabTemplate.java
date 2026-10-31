package androidx.car.app.model;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p.e4p1;
import p.qrd;
import p.sxd1;
import p.vjd1;
import p.wed1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public class TabTemplate implements sxd1 {
    private final String mActiveTabContentId;
    private final Action mEndAction;
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final TabStyle mStyle;
    private final wed1 mTabCallbackDelegate;
    private final TabContents mTabContents;
    private final List<Tab> mTabs;

    public TabTemplate(vjd1 vjd1Var) {
        this.mIsLoading = vjd1Var.b;
        this.mHeaderAction = vjd1Var.c;
        this.mTabs = e4p1.w(vjd1Var.d);
        this.mTabContents = vjd1Var.f;
        this.mTabCallbackDelegate = vjd1Var.a;
        this.mActiveTabContentId = vjd1Var.g;
        this.mStyle = vjd1Var.h;
        this.mEndAction = vjd1Var.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabTemplate)) {
            return false;
        }
        TabTemplate tabTemplate = (TabTemplate) obj;
        return this.mIsLoading == tabTemplate.mIsLoading && Objects.equals(this.mHeaderAction, tabTemplate.mHeaderAction) && Objects.equals(this.mTabs, tabTemplate.mTabs) && Objects.equals(this.mTabContents, tabTemplate.mTabContents) && Objects.equals(this.mActiveTabContentId, tabTemplate.mActiveTabContentId) && Objects.equals(this.mStyle, tabTemplate.mStyle) && Objects.equals(this.mEndAction, tabTemplate.mEndAction);
    }

    public String getActiveTabContentId() {
        String str = this.mActiveTabContentId;
        Objects.requireNonNull(str);
        return str;
    }

    public Action getEndAction() {
        return this.mEndAction;
    }

    public Action getHeaderAction() {
        Action action = this.mHeaderAction;
        Objects.requireNonNull(action);
        return action;
    }

    public TabStyle getStyle() {
        return this.mStyle;
    }

    public wed1 getTabCallbackDelegate() {
        wed1 wed1Var = this.mTabCallbackDelegate;
        Objects.requireNonNull(wed1Var);
        return wed1Var;
    }

    public TabContents getTabContents() {
        TabContents tabContents = this.mTabContents;
        Objects.requireNonNull(tabContents);
        return tabContents;
    }

    public List<Tab> getTabs() {
        List<Tab> list = this.mTabs;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mHeaderAction, this.mTabs, this.mTabContents, this.mActiveTabContentId, this.mStyle, this.mEndAction);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "TabTemplate";
    }

    private TabTemplate() {
        this.mIsLoading = false;
        this.mHeaderAction = null;
        this.mTabs = Collections.EMPTY_LIST;
        this.mTabContents = null;
        this.mTabCallbackDelegate = null;
        this.mActiveTabContentId = null;
        this.mStyle = null;
        this.mEndAction = null;
    }
}
