package androidx.car.app.messaging.model;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p.e4p1;
import p.ejb;
import p.g0n;
import p.mrs0;
import p.o0c;
import p.oto1;
import p.qi90;
import p.qrd;
import p.szm;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public class ConversationItem implements qi90 {
    private final List<Action> mActions;
    private final szm mConversationCallbackDelegate;
    private final CarIcon mIcon;
    private final String mId;
    private final boolean mIndexable;
    private final boolean mIsGroupConversation;
    private final List<CarMessage> mMessages;
    private final mrs0 mSelf;
    private final CarText mTitle;

    public ConversationItem(g0n g0nVar) {
        String str = g0nVar.a;
        Objects.requireNonNull(str);
        this.mId = str;
        CarText carText = g0nVar.b;
        Objects.requireNonNull(carText);
        this.mTitle = carText;
        this.mSelf = validateSender(g0nVar.c);
        this.mIcon = g0nVar.d;
        this.mIsGroupConversation = g0nVar.e;
        List<CarMessage> listW = e4p1.w(g0nVar.f);
        Objects.requireNonNull(listW);
        List<CarMessage> list = listW;
        this.mMessages = list;
        o0c.q("Message list cannot be empty.", !list.isEmpty());
        Iterator<CarMessage> it = list.iterator();
        while (it.hasNext()) {
            o0c.q("Message list cannot contain null messages", it.next() != null);
        }
        szm szmVar = g0nVar.g;
        Objects.requireNonNull(szmVar);
        this.mConversationCallbackDelegate = szmVar;
        this.mActions = e4p1.w(g0nVar.h);
        this.mIndexable = true;
    }

    public static mrs0 validateSender(mrs0 mrs0Var) {
        Objects.requireNonNull(mrs0Var);
        Objects.requireNonNull(mrs0Var.a);
        Objects.requireNonNull(mrs0Var.d);
        return mrs0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationItem)) {
            return false;
        }
        ConversationItem conversationItem = (ConversationItem) obj;
        return Objects.equals(this.mId, conversationItem.mId) && Objects.equals(this.mTitle, conversationItem.mTitle) && Objects.equals(this.mIcon, conversationItem.mIcon) && oto1.g(getSelf(), conversationItem.getSelf()) && this.mIsGroupConversation == conversationItem.mIsGroupConversation && Objects.equals(this.mMessages, conversationItem.mMessages) && Objects.equals(this.mActions, conversationItem.mActions) && this.mIndexable == conversationItem.mIndexable;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public szm getConversationCallbackDelegate() {
        return this.mConversationCallbackDelegate;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public String getId() {
        return this.mId;
    }

    public List<CarMessage> getMessages() {
        return this.mMessages;
    }

    public mrs0 getSelf() {
        return this.mSelf;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(oto1.n(getSelf())), this.mId, this.mTitle, this.mIcon, Boolean.valueOf(this.mIsGroupConversation), this.mMessages, this.mActions, Boolean.valueOf(this.mIndexable));
    }

    public boolean isGroupConversation() {
        return this.mIsGroupConversation;
    }

    public boolean isIndexable() {
        return this.mIndexable;
    }

    private ConversationItem() {
        this.mId = "";
        this.mTitle = new CarText.Builder("").build();
        mrs0 mrs0Var = new mrs0();
        mrs0Var.a = "";
        mrs0Var.b = null;
        mrs0Var.c = null;
        mrs0Var.d = null;
        mrs0Var.e = false;
        mrs0Var.f = false;
        this.mSelf = mrs0Var;
        this.mIcon = null;
        this.mIsGroupConversation = false;
        this.mMessages = new ArrayList();
        this.mConversationCallbackDelegate = new ConversationCallbackDelegateImpl(new ejb((byte) 3));
        this.mActions = Collections.EMPTY_LIST;
        this.mIndexable = true;
    }
}
