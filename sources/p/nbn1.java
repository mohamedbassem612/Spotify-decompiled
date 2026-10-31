package p;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nbn1 {
    public static final pue0 v = new pue0("SessionFlowSummary", (String) null);
    public static final String w = "22.2.0";
    public static long x = System.currentTimeMillis();
    public final emo1 f;
    public final String g;
    public final long i;
    public b4e j;
    public String k;
    public String l;
    public vua m;
    public String n;
    public String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f24p;
    public String q;
    public String r;
    public String s;
    public int u;
    public final pin1 a = new pin1((byte) 2);
    public final List b = Collections.synchronizedList(new ArrayList());
    public final List c = Collections.synchronizedList(new ArrayList());
    public final List d = Collections.synchronizedList(new ArrayList());
    public final Map e = Collections.synchronizedMap(new HashMap());
    public int t = 0;
    public final long h = System.currentTimeMillis();

    public nbn1(emo1 emo1Var, String str) {
        this.f = emo1Var;
        this.g = str;
        long j = x;
        x = 1 + j;
        this.i = j;
    }

    public final void a(b4e b4eVar) {
        if (b4eVar == null) {
            b(2);
            return;
        }
        zod.n("Must be called from the main thread.");
        CastDevice castDevice = b4eVar.k;
        if (castDevice == null) {
            b(3);
            return;
        }
        this.j = b4eVar;
        String str = this.l;
        String str2 = castDevice.Y;
        if (str != null) {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            b(5);
            return;
        }
        this.l = str2;
        this.n = castDevice.e;
        this.t = castDevice.c0();
        kbn1 kbn1VarA0 = castDevice.a0();
        if (kbn1VarA0 != null) {
            this.o = kbn1VarA0.d;
            this.f24p = kbn1VarA0.e;
            this.q = kbn1VarA0.f;
            this.r = kbn1VarA0.g;
            this.s = kbn1VarA0.h;
        }
        b4eVar.c();
    }

    public final void b(int i) {
        Integer numValueOf = Integer.valueOf(i - 1);
        Map map = this.e;
        sen1 sen1Var = (sen1) map.get(numValueOf);
        if (sen1Var != null) {
            sen1Var.d.incrementAndGet();
            sen1Var.b = System.currentTimeMillis();
        } else {
            sen1 sen1Var2 = new sen1(new tgo1(i));
            sen1Var2.c = this.h;
            map.put(numValueOf, sen1Var2);
        }
    }
}
