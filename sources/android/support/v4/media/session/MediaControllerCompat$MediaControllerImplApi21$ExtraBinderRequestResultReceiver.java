package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.ResultReceiver;
import androidx.media3.session.legacy.MediaSessionCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p.eqr0;
import p.h5j1;
import p.ih70;
import p.lh70;
import p.pze0;
import p.ukh0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {
    public final WeakReference a;

    public MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(a aVar) {
        super(null);
        this.a = new WeakReference(aVar);
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        lh70 ih70Var;
        a aVar = (a) this.a.get();
        if (aVar == null || bundle == null) {
            return;
        }
        synchronized (aVar.b) {
            try {
                MediaSessionCompat.Token token = aVar.e;
                IBinder binder = bundle.getBinder(MediaSessionCompat.KEY_EXTRA_BINDER);
                int i2 = b.l;
                if (binder == null) {
                    ih70Var = null;
                } else {
                    lh70 lh70VarQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                    ih70Var = (lh70VarQueryLocalInterface == null || !(lh70VarQueryLocalInterface instanceof lh70)) ? new ih70(binder) : lh70VarQueryLocalInterface;
                }
                synchronized (token.a) {
                    token.c = ih70Var;
                }
                MediaSessionCompat.Token token2 = aVar.e;
                h5j1 h5j1VarW = eqr0.w(bundle);
                synchronized (token2.a) {
                    token2.d = h5j1VarW;
                }
                ArrayList arrayList = aVar.c;
                if (aVar.e.a() != null) {
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        pze0.m(it.next());
                        aVar.d.put(null, new ukh0());
                        throw null;
                    }
                    arrayList.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
