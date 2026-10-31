package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import j$.time.LocalDate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class oh00 implements Update {
    public static final oh00 a = new oh00();

    public final Next a(Object obj, Object obj2) {
        LocalDate localDate;
        rod0 rod0VarA;
        xod0 xod0Var = (xod0) obj;
        mh00 mh00Var = (mh00) obj2;
        if (!(xod0Var instanceof uod0)) {
            return Next.j();
        }
        if (mh00Var instanceof yg00) {
            yg00 yg00Var = (yg00) mh00Var;
            return Next.a(Effects.a(new of00[]{new of00(yg00Var.a, yg00Var.b)}));
        }
        if (mh00Var instanceof mg00) {
            return r2p1.n(uod0.a((uod0) xod0Var, null, null, null, null, null, null, false, null, false, null, 1015));
        }
        if (mh00Var instanceof lh00) {
            uod0 uod0Var = (uod0) xod0Var;
            rod0 rod0Var = uod0Var.a;
            if (rod0Var != null) {
                rod0 rod0Var2 = ((lh00) mh00Var).a;
                rod0VarA = rod0.a(rod0Var, rod0Var2.a, rod0Var2.b, rod0Var2.d, rod0Var2.e, 4);
            } else {
                rod0VarA = ((lh00) mh00Var).a;
            }
            return Next.h(uod0.a(uod0Var, rod0VarA, null, null, null, null, null, false, null, false, Long.valueOf(((lh00) mh00Var).b), 126));
        }
        i5r i5rVar = null;
        if (mh00Var instanceof lg00) {
            throw null;
        }
        if (mh00Var instanceof kg00) {
            return Next.a(Effects.a(new nf00[]{nf00.e}));
        }
        if (mh00Var instanceof bh00) {
            return Next.a(Effects.a(new mf00[]{new mf00("spotify:settings:notifications:category-details:notify-in-person-concerts-and-events", ((bh00) mh00Var).a)}));
        }
        if (mh00Var instanceof ch00) {
            return Next.h(uod0.a((uod0) xod0Var, null, ((ch00) mh00Var).a, null, null, null, null, false, null, false, null, 1021));
        }
        if (mh00Var instanceof dh00) {
            return Next.a(Effects.a(new qf00[]{new qf00(new v8u0(null))}));
        }
        if (mh00Var instanceof eh00) {
            return u890.j(((uod0) xod0Var).b, (Object) null) ? Next.a(Effects.a(new qf00[]{new qf00(new z8u0(null))})) : Next.a(Effects.a(new qf00[]{new qf00(new x8u0(null, null))}));
        }
        if (mh00Var instanceof fh00) {
            return Next.a(Effects.a(new mf00[]{new mf00((String) null, (tv80) null)}));
        }
        if (mh00Var instanceof ih00) {
            return ((uod0) xod0Var).g ? Next.a(Effects.a(new mf00[]{new mf00("spotify:collection:events", ((ih00) mh00Var).b)})) : Next.a(Effects.a(new rf00[]{rf00.e}));
        }
        if (mh00Var instanceof hh00) {
            return Next.h(uod0.a((uod0) xod0Var, null, null, null, null, null, null, ((hh00) mh00Var).a, null, false, null, 959));
        }
        if (mh00Var.equals(gh00.a)) {
            return Next.j();
        }
        boolean zEquals = mh00Var.equals(pg00.a);
        myb mybVar = myb.c;
        if (zEquals) {
            return Next.h(uod0.a((uod0) xod0Var, null, null, mybVar, null, null, null, false, null, false, null, 1019));
        }
        if (mh00Var instanceof kh00) {
            kh00 kh00Var = (kh00) mh00Var;
            LocalDate localDate2 = kh00Var.a;
            if (localDate2 != null && (localDate = kh00Var.b) != null) {
                i5rVar = new i5r(localDate2, localDate);
            }
            return r2p1.n(uod0.a((uod0) xod0Var, null, null, mybVar, null, i5rVar, null, false, null, false, null, 1003));
        }
        if (mh00Var instanceof xg00) {
            uod0 uod0Var2 = (uod0) xod0Var;
            rod0 rod0Var3 = uod0Var2.a;
            if (rod0Var3 == null) {
                return Next.j();
            }
            String str = rod0Var3.e;
            return (str == null || str.length() == 0 || uod0Var2.h != null) ? Next.j() : Next.i(uod0.a(uod0Var2, null, null, null, null, null, null, false, str, false, null, 895), Effects.a(new lf00[]{new lf00(str, rod0Var3)}));
        }
        if (mh00Var instanceof ah00) {
            ah00 ah00Var = (ah00) mh00Var;
            uod0 uod0Var3 = (uod0) xod0Var;
            return u890.j(ah00Var.a, uod0Var3.h) ? Next.h(uod0.a(uod0Var3, ah00Var.b, null, null, null, null, null, false, null, false, null, 894)) : Next.j();
        }
        if (mh00Var instanceof zg00) {
            uod0 uod0Var4 = (uod0) xod0Var;
            return u890.j(((zg00) mh00Var).a, uod0Var4.h) ? Next.h(uod0.a(uod0Var4, null, null, null, null, null, null, false, null, false, null, 895)) : Next.j();
        }
        if (mh00Var.equals(vg00.a)) {
            uod0 uod0Var5 = (uod0) xod0Var;
            i5r i5rVar2 = uod0Var5.e;
            return Next.h(uod0.a(uod0Var5, null, null, new kyb(i5rVar2 != null ? i5rVar2.a : null, i5rVar2 != null ? i5rVar2.b : null), null, null, null, false, null, false, null, 1019));
        }
        boolean zEquals2 = mh00Var.equals(sg00.a);
        lyb lybVar = lyb.c;
        if (zEquals2) {
            uod0 uod0Var6 = (uod0) xod0Var;
            return Next.i(uod0.a(uod0Var6, null, null, lybVar, null, null, null, false, null, false, null, 1019), Effects.a(new kf00[]{new kf00(uod0Var6.d)}));
        }
        if (mh00Var instanceof og00) {
            return r2p1.n(uod0.a((uod0) xod0Var, null, null, null, null, null, null, false, null, false, null, 1007));
        }
        if (mh00Var instanceof jh00) {
            return r2p1.n(uod0.a((uod0) xod0Var, null, null, null, ((jh00) mh00Var).a, null, null, false, null, false, null, 1015));
        }
        if (mh00Var instanceof rg00) {
            return r2p1.n(uod0.a((uod0) xod0Var, null, null, mybVar, null, null, ((rg00) mh00Var).a, false, null, false, null, 987));
        }
        if (mh00Var.equals(ng00.a)) {
            return r2p1.n(uod0.a((uod0) xod0Var, null, null, null, null, null, z6x.a, false, null, false, null, 991));
        }
        if (mh00Var instanceof ug00) {
            uod0 uod0Var7 = (uod0) xod0Var;
            return u890.j(uod0Var7.c, lybVar) ? Next.h(uod0.a(uod0Var7, null, null, new jyb(((ug00) mh00Var).a, uod0Var7.f), null, null, null, false, null, false, null, 1019)) : Next.j();
        }
        if (mh00Var.equals(tg00.a)) {
            uod0 uod0Var8 = (uod0) xod0Var;
            return u890.j(uod0Var8.c, lybVar) ? Next.h(uod0.a(uod0Var8, null, null, mybVar, null, null, null, false, null, false, null, 1019)) : Next.j();
        }
        if (mh00Var instanceof qg00) {
            return Next.h(uod0.a((uod0) xod0Var, null, null, null, null, null, ((qg00) mh00Var).a, false, null, false, null, 991));
        }
        if (mh00Var instanceof wg00) {
            return Next.h(new sod0(((wg00) mh00Var).a));
        }
        eg.o();
        return null;
    }
}
