package p;

import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rdx0 implements Predicate, Function, siz, t2n, BiFunction, com.spotify.mobius.functions.Function, s2i1, jgg1, Init, c36 {
    public final /* synthetic */ byte a;
    public static final rdx0 b = new rdx0(0);
    public static final rdx0 c = new rdx0(2);
    public static final rdx0 d = new rdx0(3);
    public static final rdx0 e = new rdx0(4);
    public static final rdx0 f = new rdx0(5);
    public static final rdx0 g = new rdx0(6);
    public static final rdx0 h = new rdx0(7);
    public static final rdx0 i = new rdx0(8);
    public static final rdx0 t = new rdx0(9);
    public static final rdx0 X = new rdx0(10);
    public static final rdx0 Y = new rdx0(11);
    public static final rdx0 Z = new rdx0(12);
    public static final rdx0 N0 = new rdx0(13);
    public static final rdx0 O0 = new rdx0(14);
    public static final rdx0 P0 = new rdx0(15);
    public static final rdx0 Q0 = new rdx0(16);
    public static final rdx0 R0 = new rdx0(17);
    public static final rdx0 S0 = new rdx0(18);
    public static final rdx0 T0 = new rdx0(19);
    public static final rdx0 U0 = new rdx0(20);
    public static final rdx0 V0 = new rdx0(21);
    public static final rdx0 W0 = new rdx0(22);
    public static final rdx0 X0 = new rdx0(23);
    public static final rdx0 Y0 = new rdx0(24);
    public static final /* synthetic */ rdx0 Z0 = new rdx0(25);
    public static final rdx0 a1 = new rdx0(26);

    public /* synthetic */ rdx0(byte b2) {
        this.a = b2;
    }

    public static boolean d(eh4 eh4Var) {
        return eh4Var.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0122, code lost:
    
        if (r3.equals("AVAILABLE") == false) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object apply(java.lang.Object r4) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rdx0.apply(java.lang.Object):java.lang.Object");
    }

    @Override // p.siz
    public void b(jyc jycVar) {
        throw new IllegalStateException("Cannot infer visibility for " + jycVar);
    }

    @Override // p.siz
    public void c(beg begVar, ArrayList arrayList) {
        throw new IllegalStateException("Incomplete hierarchy for class " + begVar.getName() + ", unresolved classes " + arrayList);
    }

    public void e(wat watVar, int i2, int[] iArr, flb0 flb0Var, int[] iArr2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        int length = iArr.length;
        int i6 = i2 - i4;
        int i7 = 0;
        while (i3 < length) {
            int i8 = iArr[i3];
            iArr2[i7] = i6;
            i6 += i8;
            i3++;
            i7++;
        }
    }

    public First e0(Object obj) {
        return First.b((wc1) obj);
    }

    public Object g(Object obj) {
        return Short.valueOf(((uz21) obj).f());
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3;
        String str4 = (String) linkedHashMap.get("account_id");
        if (str4 == null || !gho1.k(str4) || (str3 = (String) linkedHashMap.get("social_handle")) == null) {
            return null;
        }
        return new bji1(str4, str3, xkg0Var, str2, str);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return !(((o6w) obj) instanceof l6w);
            default:
                wv00 wv00Var = (uv00) obj;
                return wv00Var.c() || !wv00Var.f;
        }
    }

    public String toString() {
        switch (this.a) {
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return "AbsoluteArrangement#Right";
            default:
                return super.toString();
        }
    }

    public Object apply(Object obj, Object obj2) {
        return new m671((PlayerState) obj, ((Boolean) obj2).booleanValue());
    }
}
