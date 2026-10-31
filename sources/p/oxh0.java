package p;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class oxh0 implements Function, akl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ oxh0(int i, Bundle bundle, String str, String str2) {
        this.a = (byte) 1;
        this.b = str;
        this.d = str2;
        this.c = i;
        this.e = bundle;
    }

    public void accept(Object obj) {
        mgc mgcVar = (mgc) this.d;
        ((w2i0) obj).E(mgcVar.b, (p2i0) mgcVar.c, (d2e0) this.b, (qqh0) this.e, this.c);
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.e;
        int i = this.c;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                Logger.h((Throwable) obj, "Resolving with the session-less callback instead.", new Object[0]);
                return ((rxh0) obj3).d((String) obj4, (omv0) obj2, i);
            default:
                return ((lxh0) obj).r(i, (Bundle) obj2, (String) obj4, (String) obj3);
        }
    }

    public /* synthetic */ oxh0(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.c = i;
    }
}
