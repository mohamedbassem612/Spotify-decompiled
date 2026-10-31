package androidx.car.app.messaging.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.f;
import java.util.Objects;
import p.b5q0;
import p.eg;
import p.qrd;
import p.rzm;
import p.szm;
import p.z321;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
class ConversationCallbackDelegateImpl implements szm {
    private final IConversationCallback mConversationCallbackBinder;

    @qrd
    public static class ConversationCallbackStub extends IConversationCallback.Stub {
        private final rzm mConversationCallback;

        public ConversationCallbackStub(rzm rzmVar) {
            this.mConversationCallback = rzmVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onMarkAsRead$0() {
            this.mConversationCallback.getClass();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onTextReply$1(String str) {
            this.mConversationCallback.getClass();
            return null;
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onMarkAsRead(IOnDoneCallback iOnDoneCallback) {
            f.b(iOnDoneCallback, "onMarkAsRead", new z321() { // from class: androidx.car.app.messaging.model.b
                @Override // p.z321
                public final Object b() {
                    return this.a.lambda$onMarkAsRead$0();
                }
            });
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onTextReply(IOnDoneCallback iOnDoneCallback, final String str) {
            f.b(iOnDoneCallback, "onReply", new z321() { // from class: androidx.car.app.messaging.model.a
                @Override // p.z321
                public final Object b() {
                    return this.a.lambda$onTextReply$1(str);
                }
            });
        }
    }

    public ConversationCallbackDelegateImpl(rzm rzmVar) {
        this.mConversationCallbackBinder = new ConversationCallbackStub(rzmVar);
    }

    public void sendMarkAsRead(b5q0 b5q0Var) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            Objects.requireNonNull(iConversationCallback);
            iConversationCallback.onMarkAsRead(f.a());
        } catch (RemoteException e) {
            eg.j(e);
        }
    }

    public void sendTextReply(String str, b5q0 b5q0Var) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            Objects.requireNonNull(iConversationCallback);
            iConversationCallback.onTextReply(f.a(), str);
        } catch (RemoteException e) {
            eg.j(e);
        }
    }

    private ConversationCallbackDelegateImpl() {
        this.mConversationCallbackBinder = null;
    }
}
