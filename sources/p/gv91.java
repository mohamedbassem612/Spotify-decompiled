package p;

import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gv91 extends h471 {
    public static final mmr0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final mmr0 f7p;
    public final r2a1 g;
    public final r7n0 h;
    public final DisplayMetrics i;
    public final ffe1 j;
    public final cn3 k;
    public final boolean l;
    public final c9 m;
    public final d471 n;

    static {
        Double dValueOf = Double.valueOf(0.5d);
        Double dValueOf2 = Double.valueOf(0.45d);
        o = new mmr0(dValueOf, dValueOf2);
        f7p = new mmr0(Double.valueOf(0.7d), dValueOf2);
    }

    public gv91(zg0 zg0Var, r2a1 r2a1Var, r7n0 r7n0Var, DisplayMetrics displayMetrics, ffe1 ffe1Var, cn3 cn3Var, boolean z) {
        super(zg0Var, mqo1.s(new String[]{"com.snapchat.android"}), "android.intent.action.SEND", "video/*", "snapchat://creativekit/preview/1", 32);
        this.g = r2a1Var;
        this.h = r7n0Var;
        this.i = displayMetrics;
        this.j = ffe1Var;
        this.k = cn3Var;
        this.l = z;
        this.m = mqo1.s(new yy61[]{yy61.GRADIENT_STORY, yy61.IMAGE_STORY, yy61.VIDEO_STORY});
        f571 f571Var = f571.d;
        this.n = new d471(2131233915, false);
    }

    public final o571 a() {
        return f571.d;
    }

    public final c9 b() {
        return this.m;
    }

    public final int c() {
        return 2131962228;
    }

    public final hyo1 d() {
        return this.n;
    }

    public final int e() {
        return 2131962227;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x010c  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // p.h471
    public final Object g(Intent intent, x871 x871Var, lnm lnmVar) {
        fv91 fv91Var;
        p371 p371Var;
        x871 x871Var2;
        int i;
        Intent intent2;
        Intent intent3;
        int i2;
        Uri uri;
        x871 x871Var3;
        Intent intent4;
        Uri uri2;
        Map mapE;
        String str;
        o371 o371Var;
        Map map;
        Intent intent5;
        Intent intent6;
        x871 x871Var4;
        Uri uri3;
        String str2;
        Intent intent7 = intent;
        if (lnmVar instanceof fv91) {
            fv91Var = (fv91) lnmVar;
            int i3 = fv91Var.Y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fv91Var.Y = i3 - Integer.MIN_VALUE;
            } else {
                fv91Var = new fv91(this, (onm) lnmVar);
            }
        } else {
            fv91Var = new fv91(this, (onm) lnmVar);
        }
        fv91 fv91Var2 = fv91Var;
        Object obj = fv91Var2.t;
        int i4 = fv91Var2.Y;
        r2a1 r2a1Var = this.g;
        Comparable comparable = d9n.a;
        if (i4 == 0) {
            hm5.M(obj);
            p371 p371Var2 = x871Var.a;
            if (!(p371Var2 instanceof i9c1)) {
                eg.m("Snapchat requires share data to be StoryShareData");
                return null;
            }
            t0c t0cVarG = ((i9c1) p371Var2).g();
            fv91Var2.a = x871Var;
            fv91Var2.b = intent7;
            fv91Var2.c = intent7;
            fv91Var2.d = p371Var2;
            fv91Var2.i = 0;
            fv91Var2.Y = 1;
            Object objH = r2a1Var.h(intent7, t0cVarG, fv91Var2);
            if (objH != comparable) {
                p371Var = p371Var2;
                obj = objH;
                x871Var2 = x871Var;
                i = 0;
                intent2 = intent7;
            }
            return comparable;
        }
        if (i4 == 1) {
            int i5 = fv91Var2.i;
            p371 p371Var3 = fv91Var2.d;
            Intent intent8 = fv91Var2.c;
            intent2 = fv91Var2.b;
            x871Var2 = fv91Var2.a;
            hm5.M(obj);
            i = i5;
            intent7 = intent8;
            p371Var = p371Var3;
        } else {
            if (i4 == 2) {
                i2 = fv91Var2.i;
                uri = fv91Var2.e;
                p371Var = fv91Var2.d;
                intent3 = fv91Var2.c;
                Intent intent9 = fv91Var2.b;
                x871 x871Var5 = fv91Var2.a;
                hm5.M(obj);
                intent4 = intent9;
                x871Var3 = x871Var5;
                uri2 = (Uri) obj;
                mapE = p371Var.e();
                str = x871Var3.b.c;
                i9c1 i9c1Var = (i9c1) p371Var;
                o371 o371VarC = i9c1Var.c();
                t2p1.w(intent3, Uri.parse("snapchat://creativekit/preview/1"), i9c1Var.g());
                fv91Var2.a = x871Var3;
                fv91Var2.b = intent4;
                fv91Var2.c = intent3;
                fv91Var2.d = null;
                fv91Var2.e = uri;
                fv91Var2.f = mapE;
                fv91Var2.g = str;
                fv91Var2.h = o371VarC;
                fv91Var2.i = i2;
                fv91Var2.Y = 3;
                o371Var = o371VarC;
                if (kkn.B(intent3, this.i, this.j, this.k, uri2, fv91Var2) != comparable) {
                    map = mapE;
                    intent5 = intent3;
                    intent6 = intent4;
                    x871Var4 = x871Var3;
                    uri3 = uri;
                    str2 = str;
                }
                return comparable;
            }
            if (i4 != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o371Var = fv91Var2.h;
            str2 = fv91Var2.g;
            map = fv91Var2.f;
            uri3 = fv91Var2.e;
            intent5 = fv91Var2.c;
            intent6 = fv91Var2.b;
            x871Var4 = fv91Var2.a;
            hm5.M(obj);
        }
        dzo1.k(intent5, new mmr0[]{new mmr0("CLIENT_ID", this.h.a.getApplicationContext().getString(2131962344)), new mmr0("android.intent.extra.STREAM", uri3), new mmr0("attachmentUrl", x871Var4.b.a)});
        t2p1.v(intent5, o371Var.a, "entityUri");
        t2p1.x(intent5, this.l, "entityUri", str2, x871Var4.c);
        t2p1.h(intent5, !o371Var.b, map, o371Var.c);
        return intent6;
        Uri uri4 = (Uri) obj;
        bnt bntVarH = ((i9c1) p371Var).h();
        fv91Var2.a = x871Var2;
        fv91Var2.b = intent2;
        fv91Var2.c = intent7;
        fv91Var2.d = p371Var;
        fv91Var2.e = uri4;
        fv91Var2.i = i;
        fv91Var2.Y = 2;
        Comparable comparableM = r2a1Var.m(intent7, bntVarH, fv91Var2);
        if (comparableM != comparable) {
            intent3 = intent7;
            i2 = i;
            uri = uri4;
            obj = comparableM;
            x871Var3 = x871Var2;
            intent4 = intent2;
            uri2 = (Uri) obj;
            mapE = p371Var.e();
            str = x871Var3.b.c;
            i9c1 i9c1Var2 = (i9c1) p371Var;
            o371 o371VarC2 = i9c1Var2.c();
            t2p1.w(intent3, Uri.parse("snapchat://creativekit/preview/1"), i9c1Var2.g());
            fv91Var2.a = x871Var3;
            fv91Var2.b = intent4;
            fv91Var2.c = intent3;
            fv91Var2.d = null;
            fv91Var2.e = uri;
            fv91Var2.f = mapE;
            fv91Var2.g = str;
            fv91Var2.h = o371VarC2;
            fv91Var2.i = i2;
            fv91Var2.Y = 3;
            o371Var = o371VarC2;
            if (kkn.B(intent3, this.i, this.j, this.k, uri2, fv91Var2) != comparable) {
                map = mapE;
                intent5 = intent3;
                intent6 = intent4;
                x871Var4 = x871Var3;
                uri3 = uri;
                str2 = str;
                dzo1.k(intent5, new mmr0[]{new mmr0("CLIENT_ID", this.h.a.getApplicationContext().getString(2131962344)), new mmr0("android.intent.extra.STREAM", uri3), new mmr0("attachmentUrl", x871Var4.b.a)});
                t2p1.v(intent5, o371Var.a, "entityUri");
                t2p1.x(intent5, this.l, "entityUri", str2, x871Var4.c);
                t2p1.h(intent5, !o371Var.b, map, o371Var.c);
                return intent6;
            }
        }
        return comparable;
    }
}
