package androidx.car.app.model;

import androidx.car.app.messaging.model.ConversationItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p.dk90;
import p.e4p1;
import p.e5d0;
import p.f5d0;
import p.g0n;
import p.qi90;
import p.qrd;
import p.sxd1;
import p.vu50;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class ListTemplate implements sxd1 {
    static final int MAX_ALLOWED_ITEMS = 100;
    static final int MAX_MESSAGES_PER_CONVERSATION = 10;

    @Deprecated
    private final ActionStrip mActionStrip;
    private final List<Action> mActions;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final List<SectionedItemList> mSectionedLists;
    private final ItemList mSingleList;

    @Deprecated
    private final CarText mTitle;

    public ListTemplate(e5d0 e5d0Var) {
        this.mIsLoading = e5d0Var.a;
        this.mTitle = e5d0Var.d;
        this.mHeaderAction = e5d0Var.e;
        this.mSingleList = e5d0Var.b;
        this.mSectionedLists = e4p1.w(e5d0Var.c);
        this.mActionStrip = e5d0Var.f;
        this.mActions = e4p1.w(e5d0Var.g);
        this.mHeader = e5d0Var.h;
    }

    public static List<SectionedItemList> getTruncatedCopy(List<SectionedItemList> list) {
        f5d0 f5d0Var = new f5d0();
        f5d0Var.a = 100;
        ArrayList arrayList = new ArrayList();
        for (SectionedItemList sectionedItemList : list) {
            arrayList.add(SectionedItemList.create(truncate(sectionedItemList.getItemList(), f5d0Var), sectionedItemList.getHeader().toCharSequence()));
            if (f5d0Var.a <= 0) {
                break;
            }
        }
        return arrayList;
    }

    public static ItemList truncate(ItemList itemList, f5d0 f5d0Var) {
        dk90 dk90Var = new dk90(itemList);
        ArrayList arrayList = dk90Var.a;
        arrayList.clear();
        for (qi90 qi90Var : itemList.getItems()) {
            if (!(qi90Var instanceof ConversationItem)) {
                if (f5d0Var.a < 1) {
                    break;
                }
                Objects.requireNonNull(qi90Var);
                arrayList.add(qi90Var);
                f5d0Var.a--;
            } else {
                ConversationItem conversationItem = (ConversationItem) qi90Var;
                if (f5d0Var.a < 2) {
                    break;
                }
                g0n g0nVar = new g0n(conversationItem);
                int i = f5d0Var.a - 1;
                f5d0Var.a = i;
                int iMin = Math.min(i, 10);
                int size = conversationItem.getMessages().size();
                int iMin2 = Math.min(size, iMin);
                g0nVar.f = conversationItem.getMessages().subList(size - iMin2, size);
                arrayList.add(new ConversationItem(g0nVar));
                f5d0Var.a -= iMin2;
            }
        }
        return dk90Var.a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListTemplate)) {
            return false;
        }
        ListTemplate listTemplate = (ListTemplate) obj;
        return this.mIsLoading == listTemplate.mIsLoading && Objects.equals(this.mTitle, listTemplate.mTitle) && Objects.equals(this.mHeaderAction, listTemplate.mHeaderAction) && Objects.equals(this.mSingleList, listTemplate.mSingleList) && Objects.equals(this.mSectionedLists, listTemplate.mSectionedLists) && Objects.equals(this.mActionStrip, listTemplate.mActionStrip) && Objects.equals(this.mActions, listTemplate.mActions) && Objects.equals(this.mHeader, listTemplate.mHeader);
    }

    @Deprecated
    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public Header getHeader() {
        Header header = this.mHeader;
        if (header != null) {
            return header;
        }
        if (this.mTitle == null && this.mHeaderAction == null && this.mActionStrip == null) {
            return null;
        }
        vu50 vu50Var = new vu50();
        CarText carText = this.mTitle;
        if (carText != null) {
            vu50Var.d(carText);
        }
        Action action = this.mHeaderAction;
        if (action != null) {
            vu50Var.c(action);
        }
        ActionStrip actionStrip = this.mActionStrip;
        if (actionStrip != null) {
            Iterator<Action> it = actionStrip.getActions().iterator();
            while (it.hasNext()) {
                vu50Var.a(it.next());
            }
        }
        return vu50Var.b();
    }

    @Deprecated
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public List<SectionedItemList> getSectionedLists() {
        List<SectionedItemList> list = this.mSectionedLists;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public ItemList getSingleList() {
        return this.mSingleList;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mTitle, this.mHeaderAction, this.mSingleList, this.mSectionedLists, this.mActionStrip, this.mHeader);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public e5d0 toBuilder() {
        return new e5d0(this);
    }

    public String toString() {
        return "ListTemplate";
    }

    private ListTemplate() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mHeaderAction = null;
        this.mSingleList = null;
        List list = Collections.EMPTY_LIST;
        this.mSectionedLists = list;
        this.mActionStrip = null;
        this.mActions = list;
        this.mHeader = null;
    }
}
