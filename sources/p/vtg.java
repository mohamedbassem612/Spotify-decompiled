package p;

import android.os.Looper;
import com.spotify.base.java.logging.Logger;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vtg implements Runnable {
    public final /* synthetic */ wtg a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    public vtg(wtg wtgVar, String str, String str2, String str3, String str4, String str5) {
        this.a = wtgVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.Y) {
            return;
        }
        wtg wtgVar = this.a;
        ttg ttgVar = new ttg(wtgVar, this.b, this.c, this.d, this.e, this.f);
        ttg ttgVar2 = (ttg) wtgVar.f.get(wtgVar.g);
        boolean z = false;
        if (ttgVar2 != null && ttgVar2.f) {
            z = true;
        }
        ttg ttgVar3 = (ttg) this.a.f.put(this.b, ttgVar);
        if (ttgVar3 != null) {
            ttgVar3.a(null);
        }
        lag lagVar = this.a.e;
        String str = this.b;
        ((LinkedHashMap) lagVar.e).remove(str);
        jtg jtgVar = (jtg) lagVar.b;
        gtg gtgVar = (gtg) jtgVar.d.a.getValue();
        LinkedHashMap linkedHashMap = jtgVar.b;
        z6x z6xVar = z6x.a;
        itg itgVar = new itg();
        itgVar.a = z6xVar;
        itgVar.b = null;
        itgVar.c = 0L;
        linkedHashMap.put(str, itgVar);
        gtg gtgVar2 = (gtg) jtgVar.d.a.getValue();
        if (!u890.j(gtgVar2, gtgVar)) {
            ((ftg) lagVar.c).a(gtgVar2);
        }
        if (u890.j(((gtg) jtgVar.d.a.getValue()).a, str)) {
            lagVar.s(str);
        }
        if (ttgVar3 == null && this.a.f.size() == 1) {
            wtg wtgVar2 = this.a;
            cug cugVar = wtgVar2.a;
            lo9 lo9Var = wtgVar2.N0;
            cugVar.getClass();
            ame ameVar = new ame(cugVar, lo9Var, (byte) 19);
            if (u890.j(Looper.myLooper(), Looper.getMainLooper())) {
                ameVar.invoke();
            } else {
                cugVar.b.post(new is3(ameVar, (byte) 3));
            }
        }
        Logger.g("registerPlayback: id=%s, uri=%s", new Object[]{this.b, this.d});
        wtg wtgVar3 = this.a;
        String str2 = this.b;
        if (z) {
            ttgVar.a(wtgVar3.a(str2));
        } else {
            wtgVar3.g = str2;
            wtgVar3.c();
        }
        this.a.e();
        this.a.d();
    }
}
