package p;

import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g0n {
    public final String a;
    public final CarText b;
    public final mrs0 c;
    public final CarIcon d;
    public final boolean e;
    public List f;
    public final szm g;
    public final ArrayList h;

    public g0n(ConversationItem conversationItem) {
        this.a = conversationItem.getId();
        this.b = conversationItem.getTitle();
        this.c = conversationItem.getSelf();
        this.d = conversationItem.getIcon();
        this.e = conversationItem.isGroupConversation();
        this.g = conversationItem.getConversationCallbackDelegate();
        this.f = conversationItem.getMessages();
        this.h = new ArrayList(conversationItem.getActions());
    }
}
