package p;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class u2i0 implements akl, SingleOnSubscribe {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ u2i0(Object obj, Object obj2, Object obj3, Serializable serializable, boolean z) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = serializable;
        this.a = z;
    }

    public void accept(Object obj) {
        mgc mgcVar = (mgc) this.b;
        ((w2i0) obj).v(mgcVar.b, (p2i0) mgcVar.c, (d2e0) this.c, (qqh0) this.d, (IOException) this.e, this.a);
    }

    public void subscribe(SingleEmitter singleEmitter) {
        int iMin;
        int iMin2;
        j5 i5w0Var;
        oh61 oh61Var = (oh61) this.b;
        pr5 pr5Var = (pr5) this.c;
        Integer num = (Integer) this.d;
        Integer num2 = (Integer) this.e;
        boolean z = this.a;
        Integer num3 = pr5Var.d;
        if (num3 == null || num3.intValue() <= 0) {
            iMin = Math.min(num == null ? 0 : num.intValue(), 720);
        } else {
            iMin = Math.min(num3.intValue(), 720);
        }
        int i = iMin;
        Integer num4 = pr5Var.c;
        if (num4 == null || num4.intValue() <= 0) {
            iMin2 = Math.min(num2 == null ? 0 : num2.intValue(), 720);
        } else {
            iMin2 = Math.min(num4.intValue(), 720);
        }
        int i2 = iMin2;
        String str = pr5Var.e;
        if (str == null) {
            str = oh61Var.o.c.j;
        }
        if (!oh61Var.q) {
            i090 i090Var = oh61Var.d;
            if (!i090Var.d) {
                synchronized (i090Var.c) {
                    try {
                        Iterator it = i090Var.c.iterator();
                        while (it.hasNext()) {
                            ((h090) it.next()).a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        i090 i090Var2 = oh61Var.d;
        Uri uri = Uri.parse(pr5Var.b);
        int i3 = (!"jpeg".equals(str) && "png".equals(str)) ? 1 : 2;
        pyp0 pyp0Var = new pyp0(singleEmitter, i, i2, (byte) 7);
        if (i090Var2.d) {
            Logger.d("Can't load images after the loader has been stopped.", new Object[0]);
            i5w0Var = j5.a;
        } else {
            h090 h090Var = new h090(i090Var2, pyp0Var, uri, i3, i, i2, z);
            synchronized (i090Var2.c) {
                i090Var2.c.add(h090Var);
            }
            i090Var2.a.post(new m2d((Object) i090Var2, (Object) uri, (Object) h090Var, (Object) pyp0Var, (byte) 8));
            i5w0Var = new i5w0(h090Var);
        }
        singleEmitter.setCancellable(new u241(oh61Var, i5w0Var, (byte) 2));
    }
}
