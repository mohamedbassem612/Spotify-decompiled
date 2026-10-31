package p;

import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import androidx.media3.session.legacy.MediaBrowserProtocol;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lhh0 extends Handler {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public Object c;

    public lhh0(fvh0 fvh0Var, String str) {
        super(Looper.myLooper());
        this.b = fvh0Var;
        this.c = str;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        nvh0 nvh0VarC;
        nvh0 nvh0VarC2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                WeakReference weakReference2 = (WeakReference) this.c;
                if (weakReference2 == null || weakReference2.get() == null || weakReference.get() == null) {
                    return;
                }
                Bundle data = message.getData();
                eyh0.b(data);
                mhh0 mhh0Var = (mhh0) weakReference.get();
                Messenger messenger = (Messenger) ((WeakReference) this.c).get();
                try {
                    int i = message.what;
                    if (i == 1) {
                        eyh0.b(data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS));
                        data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID);
                        data.getParcelable("data_media_session_token");
                        mhh0Var.getClass();
                        return;
                    }
                    if (i == 2) {
                        mhh0Var.getClass();
                        return;
                    }
                    if (i != 3) {
                        message.toString();
                        return;
                    }
                    eyh0.b(data.getBundle(MediaBrowserProtocol.DATA_OPTIONS));
                    eyh0.b(data.getBundle(MediaBrowserProtocol.DATA_NOTIFY_CHILDREN_CHANGED_OPTIONS));
                    String string = data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID);
                    data.getParcelableArrayList(MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST);
                    if (mhh0Var.g != messenger) {
                        return;
                    }
                    if (mhh0Var.e.get(string) != null) {
                        throw new ClassCastException();
                    }
                    int i2 = ohh0.b;
                    return;
                } catch (BadParcelableException unused) {
                    if (message.what == 1) {
                        mhh0Var.getClass();
                        return;
                    }
                    return;
                }
            default:
                fvh0 fvh0Var = (fvh0) obj;
                Messenger messenger2 = message.replyTo;
                int i3 = message.what;
                int i4 = message.arg1;
                Object obj2 = message.obj;
                Bundle data2 = message.getData();
                if (i3 == 7) {
                    int i5 = data2.getInt("volume", -1);
                    String string2 = data2.getString("routeId");
                    if (i5 < 0 || string2 == null || (nvh0VarC = fvh0Var.c(string2)) == null) {
                        return;
                    }
                    nvh0VarC.g(i5);
                    return;
                }
                if (i3 != 8) {
                    if (i3 == 9 && (obj2 instanceof Intent)) {
                        fvh0Var.f(messenger2, i4, (String) this.c, (Intent) obj2);
                        return;
                    }
                    return;
                }
                int i6 = data2.getInt("volume", 0);
                String string3 = data2.getString("routeId");
                if (i6 == 0 || string3 == null || (nvh0VarC2 = fvh0Var.c(string3)) == null) {
                    return;
                }
                nvh0VarC2.j(i6);
                return;
        }
    }

    public lhh0(mhh0 mhh0Var) {
        this.b = new WeakReference(mhh0Var);
    }
}
