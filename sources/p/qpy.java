package p;

import androidx.car.app.k;
import androidx.car.app.model.Action;
import androidx.car.app.model.Header;
import androidx.car.app.model.SectionedItemTemplate;
import com.spotify.cosmos.p000servicebasedrouter.AndroidServicebasedrouterProperties$TestHelper;
import com.spotify.mobius.MobiusLoop;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qpy extends ed10 {
    public final wqn0 Q0;
    public final String R0;
    public final cny S0;
    public final i8h1 T0;
    public final t64 U0;
    public final zle1 V0;
    public final cce W0;
    public final h0y X0;
    public final vhd Y0;
    public MobiusLoop Z0;
    public t45 a1;
    public final py9 b1;
    public final r6h1 c1;
    public final pdy d1;

    public qpy(wqn0 wqn0Var, String str, k kVar, fna fnaVar, cny cnyVar, md10 md10Var, qzn0 qzn0Var, i8h1 i8h1Var, t64 t64Var, zle1 zle1Var, cce cceVar, h0y h0yVar, vhd vhdVar) {
        r6h1 r6h1Var;
        super(kVar, fnaVar, i8h1Var, qzn0Var, md10Var, t64Var);
        this.Q0 = wqn0Var;
        this.R0 = str;
        this.S0 = cnyVar;
        this.T0 = i8h1Var;
        this.U0 = t64Var;
        this.V0 = zle1Var;
        this.W0 = cceVar;
        this.X0 = h0yVar;
        this.Y0 = vhdVar;
        boolean z = wqn0Var instanceof iqn0;
        lnm lnmVar = null;
        if (z || (wqn0Var instanceof dqn0)) {
            String uri = wqn0Var.getUri();
            y6h1 y6h1Var = y6h1.i;
            x6h1 x6h1VarI = i3o1.i();
            x6h1VarI.h = "music";
            x6h1VarI.a = "mobile-carapplibrary-entity-playlist";
            x6h1VarI.f = "1.0.0";
            x6h1VarI.g = "22.0.0";
            x6h1VarI.d = uri;
            y6h1 y6h1VarA = x6h1VarI.a();
            Collections.singletonList("playlist");
            r6h1 r6h1Var2 = r6h1.c;
            r6h1Var = new r6h1(kk0.l(y6h1VarA), (u8h1) null);
        } else if (wqn0Var instanceof spn0) {
            String str2 = ((spn0) wqn0Var).a;
            y6h1 y6h1Var2 = y6h1.i;
            x6h1 x6h1VarI2 = i3o1.i();
            x6h1VarI2.h = "music";
            x6h1VarI2.a = "mobile-carapplibrary-entity-album";
            x6h1VarI2.f = "1.0.0";
            x6h1VarI2.g = "22.0.0";
            x6h1VarI2.d = str2;
            y6h1 y6h1VarA2 = x6h1VarI2.a();
            Collections.singletonList("album");
            r6h1 r6h1Var3 = r6h1.c;
            r6h1Var = new r6h1(kk0.l(y6h1VarA2), (u8h1) null);
        } else if (wqn0Var instanceof tpn0) {
            String str3 = ((tpn0) wqn0Var).a;
            y6h1 y6h1Var3 = y6h1.i;
            x6h1 x6h1VarI3 = i3o1.i();
            x6h1VarI3.h = "music";
            x6h1VarI3.a = "mobile-carapplibrary-entity-artist";
            x6h1VarI3.f = "1.0.0";
            x6h1VarI3.g = "22.0.0";
            x6h1VarI3.d = str3;
            y6h1 y6h1VarA3 = x6h1VarI3.a();
            Collections.singletonList("artist");
            r6h1 r6h1Var4 = r6h1.c;
            r6h1Var = new r6h1(kk0.l(y6h1VarA3), (u8h1) null);
        } else if ((wqn0Var instanceof oqn0) || (wqn0Var instanceof jqn0)) {
            String uri2 = wqn0Var.getUri();
            y6h1 y6h1Var4 = y6h1.i;
            x6h1 x6h1VarI4 = i3o1.i();
            x6h1VarI4.h = "music";
            x6h1VarI4.a = "mobile-carapplibrary-entity-show";
            x6h1VarI4.f = "1.0.0";
            x6h1VarI4.g = "22.0.0";
            x6h1VarI4.d = uri2;
            y6h1 y6h1VarA4 = x6h1VarI4.a();
            Collections.singletonList("shows");
            r6h1 r6h1Var5 = r6h1.c;
            r6h1Var = new r6h1(kk0.l(y6h1VarA4), (u8h1) null);
        } else if (wqn0Var instanceof xpn0) {
            String str4 = ((xpn0) wqn0Var).a;
            y6h1 y6h1Var5 = y6h1.i;
            x6h1 x6h1VarI5 = i3o1.i();
            x6h1VarI5.h = "music";
            x6h1VarI5.a = "mobile-carapplibrary-entity-genre";
            x6h1VarI5.f = "1.0.0";
            x6h1VarI5.g = "22.0.0";
            x6h1VarI5.d = str4;
            y6h1 y6h1VarA5 = x6h1VarI5.a();
            Collections.singletonList("genre");
            r6h1 r6h1Var6 = r6h1.c;
            r6h1Var = new r6h1(kk0.l(y6h1VarA5), (u8h1) null);
        } else if (wqn0Var instanceof gqn0) {
            String str5 = ((gqn0) wqn0Var).a;
            y6h1 y6h1Var6 = y6h1.i;
            x6h1 x6h1VarI6 = i3o1.i();
            x6h1VarI6.h = "music";
            x6h1VarI6.a = "mobile-carapplibrary-entity-new-episodes";
            x6h1VarI6.f = "1.0.0";
            x6h1VarI6.g = "22.0.0";
            x6h1VarI6.d = str5;
            y6h1 y6h1VarA6 = x6h1VarI6.a();
            Collections.singletonList("collection/podcasts/episodes/listenlater");
            r6h1 r6h1Var7 = r6h1.c;
            r6h1Var = new r6h1(kk0.l(y6h1VarA6), (u8h1) null);
        } else if (wqn0Var instanceof hqn0) {
            String str6 = ((hqn0) wqn0Var).a;
            y6h1 y6h1Var7 = y6h1.i;
            x6h1 x6h1VarI7 = i3o1.i();
            x6h1VarI7.h = "music";
            x6h1VarI7.a = "mobile-carapplibrary-entity-offline-backup";
            x6h1VarI7.f = "1.0.0";
            x6h1VarI7.g = "22.0.0";
            x6h1VarI7.d = str6;
            y6h1 y6h1VarA7 = x6h1VarI7.a();
            Collections.singletonList("cached-files");
            r6h1 r6h1Var8 = r6h1.c;
            r6h1Var = new r6h1(kk0.l(y6h1VarA7), (u8h1) null);
        } else if (wqn0Var instanceof tqn0) {
            String str7 = ((tqn0) wqn0Var).a;
            y6h1 y6h1Var8 = y6h1.i;
            x6h1 x6h1VarI8 = i3o1.i();
            x6h1VarI8.h = "music";
            x6h1VarI8.a = "mobile-carapplibrary-entity-local-files";
            x6h1VarI8.f = "1.0.0";
            x6h1VarI8.g = "22.0.0";
            x6h1VarI8.d = str7;
            y6h1 y6h1VarA8 = x6h1VarI8.a();
            Collections.singletonList("localfiles");
            r6h1 r6h1Var9 = r6h1.c;
            r6h1Var = new r6h1(kk0.l(y6h1VarA8), (u8h1) null);
        } else if (wqn0Var.equals(uqn0.a)) {
            y6h1 y6h1Var9 = y6h1.i;
            x6h1 x6h1VarI9 = i3o1.i();
            x6h1VarI9.h = "music";
            x6h1VarI9.a = "mobile-carapplibrary-your-playlists";
            x6h1VarI9.f = "1.1.0";
            x6h1VarI9.g = "22.0.0";
            y6h1 y6h1VarA9 = x6h1VarI9.a();
            Collections.singletonList("yourlibrary/playlists");
            r6h1 r6h1Var10 = r6h1.c;
            r6h1Var = new r6h1(kk0.l(y6h1VarA9), (u8h1) null);
        } else if (wqn0Var.equals(qqn0.a)) {
            y6h1 y6h1Var10 = y6h1.i;
            x6h1 x6h1VarI10 = i3o1.i();
            x6h1VarI10.h = "music";
            x6h1VarI10.a = "mobile-carapplibrary-your-artists";
            x6h1VarI10.f = "2.0.0";
            x6h1VarI10.g = "22.0.0";
            y6h1 y6h1VarA10 = x6h1VarI10.a();
            Collections.singletonList("yourlibrary/artists");
            r6h1 r6h1Var11 = r6h1.c;
            r6h1Var = new r6h1(kk0.l(y6h1VarA10), (u8h1) null);
        } else if (wqn0Var.equals(pqn0.a)) {
            y6h1 y6h1Var11 = y6h1.i;
            x6h1 x6h1VarI11 = i3o1.i();
            x6h1VarI11.h = "music";
            x6h1VarI11.a = "mobile-carapplibrary-your-albums";
            x6h1VarI11.f = "1.1.0";
            x6h1VarI11.g = "22.0.0";
            y6h1 y6h1VarA11 = x6h1VarI11.a();
            Collections.singletonList("yourlibrary/albums");
            r6h1 r6h1Var12 = r6h1.c;
            r6h1Var = new r6h1(kk0.l(y6h1VarA11), (u8h1) null);
        } else if (wqn0Var.equals(vqn0.a)) {
            y6h1 y6h1Var12 = y6h1.i;
            x6h1 x6h1VarI12 = i3o1.i();
            x6h1VarI12.h = "music";
            x6h1VarI12.a = "mobile-carapplibrary-your-shows";
            x6h1VarI12.f = "1.1.0";
            x6h1VarI12.g = "22.0.0";
            y6h1 y6h1VarA12 = x6h1VarI12.a();
            Collections.singletonList("yourlibrary/shows");
            r6h1 r6h1Var13 = r6h1.c;
            r6h1Var = new r6h1(kk0.l(y6h1VarA12), (u8h1) null);
        } else if (wqn0Var.equals(rqn0.a)) {
            y6h1 y6h1Var13 = y6h1.i;
            x6h1 x6h1VarI13 = i3o1.i();
            x6h1VarI13.h = "music";
            x6h1VarI13.a = "mobile-carapplibrary-your-audiobooks";
            x6h1VarI13.f = "1.1.0";
            x6h1VarI13.g = "22.0.0";
            y6h1 y6h1VarA13 = x6h1VarI13.a();
            Collections.singletonList("yourlibrary/audiobooks");
            r6h1 r6h1Var14 = r6h1.c;
            r6h1Var = new r6h1(kk0.l(y6h1VarA13), (u8h1) null);
        } else if (wqn0Var.equals(sqn0.a)) {
            y6h1 y6h1Var14 = y6h1.i;
            x6h1 x6h1VarI14 = i3o1.i();
            x6h1VarI14.h = "music";
            x6h1VarI14.a = "mobile-carapplibrary-your-downloads";
            x6h1VarI14.f = "1.1.0";
            x6h1VarI14.g = "22.0.0";
            y6h1 y6h1VarA14 = x6h1VarI14.a();
            Collections.singletonList("yourlibrary/downloads");
            r6h1 r6h1Var15 = r6h1.c;
            r6h1Var = new r6h1(kk0.l(y6h1VarA14), (u8h1) null);
        } else if (wqn0Var instanceof wpn0) {
            y6h1 y6h1Var15 = y6h1.i;
            x6h1 x6h1VarI15 = i3o1.i();
            x6h1VarI15.h = "music";
            x6h1VarI15.a = "mobile-carapplibrary-folder";
            x6h1VarI15.f = "2.1.0";
            x6h1VarI15.g = "22.0.0";
            y6h1 y6h1VarA15 = x6h1VarI15.a();
            Collections.singletonList("playlist/folder");
            r6h1 r6h1Var16 = r6h1.c;
            r6h1Var = new r6h1(kk0.l(y6h1VarA15), (u8h1) null);
        } else if (wqn0Var instanceof nqn0) {
            String str8 = ypn0.b;
            y6h1 y6h1Var16 = y6h1.i;
            x6h1 x6h1VarI16 = i3o1.i();
            x6h1VarI16.h = "music";
            x6h1VarI16.a = "mobile-carapplibrary-home";
            x6h1VarI16.f = "1.0.0";
            x6h1VarI16.g = "22.0.0";
            x6h1VarI16.b = str8;
            x6h1VarI16.e = null;
            x6h1VarI16.d = "spotify:home";
            y6h1 y6h1VarA16 = x6h1VarI16.a();
            Collections.singletonList("home");
            r6h1 r6h1Var17 = r6h1.c;
            r6h1Var = new r6h1(kk0.l(y6h1VarA16), (u8h1) null);
        } else {
            v8i0.j("[CAL] No root spec for entity: ", rc11.a.b(wqn0Var.getClass()).r());
            r6h1Var = null;
        }
        py9 py9Var = (r6h1Var == null || !(z || (wqn0Var instanceof dqn0) || (wqn0Var instanceof spn0) || (wqn0Var instanceof tpn0) || (wqn0Var instanceof oqn0) || (wqn0Var instanceof jqn0) || (wqn0Var instanceof xpn0) || (wqn0Var instanceof gqn0) || (wqn0Var instanceof hqn0) || (wqn0Var instanceof tqn0))) ? null : new py9(wqn0Var.a(), wqn0Var.getUri(), r6h1Var, (byte) 21);
        this.b1 = py9Var;
        fn31.T(cto1.q(this), (o8n) null, 0, new bu(this, lnmVar, (byte) 15), 3).L(new i5w(this, (byte) 27));
        if (py9Var != null) {
            r6h1Var = py9Var.b();
        } else if (r6h1Var == null) {
            r6h1Var = r6h1.c;
        }
        this.c1 = r6h1Var;
        this.d1 = new pdy(this, (byte) 3);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:107:0x01be  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x01e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:201:0x0378  */
    /* JADX WARN: Code duplicated, block: B:206:0x039c  */
    /* JADX WARN: Code duplicated, block: B:211:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:213:0x03df  */
    /* JADX WARN: Code duplicated, block: B:215:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:216:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:219:0x0424  */
    /* JADX WARN: Code duplicated, block: B:223:0x0444 A[LOOP:3: B:221:0x043e->B:223:0x0444, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:226:0x0482  */
    /* JADX WARN: Code duplicated, block: B:227:0x0497  */
    /* JADX WARN: Code duplicated, block: B:243:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:251:0x052a  */
    /* JADX WARN: Code duplicated, block: B:266:0x0502 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x013e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0148  */
    /* JADX WARN: Code duplicated, block: B:76:0x0150  */
    /* JADX WARN: Code duplicated, block: B:78:0x0155  */
    /* JADX WARN: Code duplicated, block: B:80:0x0158  */
    /* JADX WARN: Code duplicated, block: B:81:0x015c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0160  */
    /* JADX WARN: Code duplicated, block: B:84:0x0164  */
    /* JADX WARN: Code duplicated, block: B:87:0x016f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0198  */
    /* JADX WARN: Code duplicated, block: B:94:0x019b  */
    /* JADX WARN: Code duplicated, block: B:96:0x019e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    public final sxd1 d() {
        ?? arrayList;
        boolean z;
        boolean z2;
        Object obj;
        int i;
        g1d0 g1d0Var;
        String str;
        boolean z3;
        int iC;
        String str2;
        int i2;
        kwc kwcVar;
        int iC2;
        int i3;
        i80 j80Var;
        i80 j80Var2;
        apd apdVar;
        ?? r8;
        Object next;
        Integer numValueOf;
        ?? arrayList2;
        w3w w3wVar;
        Integer num;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i4;
        ?? r9;
        qpy qpyVar;
        t45 t45Var;
        int i5;
        fpd fpdVar;
        boolean z4;
        String id;
        ArrayList arrayList5;
        Iterator it;
        cce cceVar;
        wqn0 wqn0Var;
        t7y t7yVar;
        l6w0 iti1Var;
        boolean z5;
        fvc fvcVarB;
        qpy qpyVar2 = this;
        MobiusLoop mobiusLoop = qpyVar2.Z0;
        if (mobiusLoop == null) {
            u890.C("mobiusLoop");
            throw null;
        }
        dny dnyVar = (dny) mobiusLoop.i;
        if (dnyVar == null) {
            String uri = qpyVar2.Q0.getUri();
            wqn0 wqn0Var2 = qpyVar2.Q0;
            boolean z6 = wqn0Var2 instanceof nqn0;
            nqn0 nqn0Var = z6 ? (nqn0) wqn0Var2 : null;
            String str3 = nqn0Var != null ? nqn0Var.b : null;
            nqn0 nqn0Var2 = z6 ? (nqn0) wqn0Var2 : null;
            dnyVar = new dny(uri, str3, nqn0Var2 != null ? nqn0Var2.b : null, null, 1016);
        }
        int iC3 = l1d.C(dnyVar.d);
        if (iC3 == 0) {
            SectionedItemTemplate sectionedItemTemplateV = lgo1.v(ed10.g(qpyVar2));
            t45 t45Var2 = qpyVar2.a1;
            if (t45Var2 != null) {
                t45Var2.g("template_render");
                qpyVar2.V0.b(t45Var2.e());
            }
            qpyVar2.a1 = null;
            return sectionedItemTemplateV;
        }
        if (iC3 != 1) {
            if (iC3 == 2 || iC3 == 3) {
                return lgo1.w(true, (Header) null, ed10.g(qpyVar2), (List) null, 26);
            }
            eg.o();
            return null;
        }
        h0y h0yVar = qpyVar2.X0;
        wqn0 wqn0Var3 = qpyVar2.Q0;
        h0yVar.getClass();
        String str4 = dnyVar.a;
        boolean z7 = wqn0Var3 instanceof nqn0;
        List list = dnyVar.f;
        if (z7) {
            List<Object> list2 = list;
            arrayList = new ArrayList(q7h.U(list2, 10));
            for (Object objE : list2) {
                if (objE instanceof dpd) {
                    objE = dpd.e((dpd) objE, null, null, 1022);
                }
                arrayList.add(objE);
            }
        } else {
            arrayList = list;
        }
        hf81 hf81Var = (hf81) z561.W(z561.V(new oh40(new i46((Iterable) arrayList, (byte) 1), lgx.U0, (byte) 2)));
        if (hf81Var != null) {
            int i6 = hf81Var.a;
            int i7 = hf81Var.c;
            jf81 jf81Var = dnyVar.i;
            boolean z8 = dnyVar.h;
            boolean z9 = dnyVar.g;
            tqb1 tqb1Var = dnyVar.j;
            if (tqb1Var != null) {
                boolean z10 = tqb1Var.a;
                if (z10) {
                    z = z9;
                    z2 = z10;
                } else {
                    z = z9;
                    z2 = z10;
                    mf20 mf20Var = new mf20(z561.f0(gny.Q0, z561.X(gny.P0, new i46(list, (byte) 1))));
                    while (true) {
                        if (!mf20Var.hasNext()) {
                            obj = null;
                            break;
                        }
                        Object next2 = mf20Var.next();
                        j80 j80Var3 = (j80) next2;
                        obj = next2;
                        if (u890.j(j80Var3.a, str4) && j80Var3.b != null) {
                            break;
                        }
                    }
                    j80 j80Var4 = (j80) obj;
                    String str5 = j80Var4 != null ? j80Var4.b : null;
                    if (z2 && !z && !z8 && jf81Var.a == 1 && str5 == null) {
                        v8i0.j("[CAL] Retaining ShufflePlay item because no first track is available for context URI ", str4);
                        str2 = "template_render";
                        apdVar = null;
                    } else {
                        i = jf81Var.a;
                        g1d0Var = tqb1Var.b;
                        str = dnyVar.a;
                        if (z) {
                            str2 = "template_render";
                            i2 = 2131953109;
                            z3 = z8;
                        } else {
                            z3 = z8;
                            iC = l1d.C(i);
                            if (iC != 0) {
                                str2 = "template_render";
                                if (iC != 1) {
                                    i2 = 2131953111;
                                } else {
                                    if (iC == 2) {
                                        eg.o();
                                        return null;
                                    }
                                    i2 = 2131953112;
                                }
                            } else {
                                str2 = "template_render";
                                i2 = 2131953110;
                            }
                        }
                        kwc kwcVar2 = new kwc(i2);
                        if (i == 1 || g1d0Var == null) {
                            kwcVar = null;
                        } else {
                            kwcVar = new kwc(2131953103, p7h.M(new String[]{String.valueOf(g1d0Var.a), String.valueOf(g1d0Var.b)}));
                        }
                        iC2 = l1d.C(i);
                        if (iC2 != 0) {
                            if (iC2 != 1) {
                                if (iC2 == 2) {
                                    eg.o();
                                    return null;
                                }
                                if (z) {
                                    i3 = 2131231083;
                                } else {
                                    i3 = 2131231086;
                                }
                            } else if (z) {
                                i3 = 2131231082;
                            } else {
                                i3 = 2131231085;
                            }
                        } else if (z) {
                            i3 = 2131231081;
                        } else {
                            i3 = 2131231084;
                        }
                        avc avcVar = new avc(i3, (Integer) null, 240.0f, 240.0f, 0);
                        if (z) {
                            j80Var = new i80(str);
                        } else if (i != 1 || z3) {
                            if (!z3 || str5 == null) {
                                j80Var = new j80(null, str, null);
                            } else {
                                j80Var2 = new j80(0L, str, str5);
                            }
                            apdVar = new apd(kwcVar2, kwcVar, avcVar, j80Var2, null, null, 224);
                        } else {
                            j80Var = new k80(str);
                        }
                        j80Var2 = j80Var;
                        apdVar = new apd(kwcVar2, kwcVar, avcVar, j80Var2, null, null, 224);
                    }
                }
                if (z2) {
                }
                i = jf81Var.a;
                g1d0Var = tqb1Var.b;
                str = dnyVar.a;
                if (z) {
                    str2 = "template_render";
                    i2 = 2131953109;
                    z3 = z8;
                } else {
                    z3 = z8;
                    iC = l1d.C(i);
                    if (iC != 0) {
                        str2 = "template_render";
                        if (iC != 1) {
                            i2 = 2131953111;
                        } else {
                            if (iC == 2) {
                                eg.o();
                                return null;
                            }
                            i2 = 2131953112;
                        }
                    } else {
                        str2 = "template_render";
                        i2 = 2131953110;
                    }
                }
                kwc kwcVar3 = new kwc(i2);
                if (i == 1) {
                    kwcVar = null;
                } else {
                    kwcVar = new kwc(2131953103, p7h.M(new String[]{String.valueOf(g1d0Var.a), String.valueOf(g1d0Var.b)}));
                }
                iC2 = l1d.C(i);
                if (iC2 != 0) {
                    if (iC2 != 1) {
                        if (iC2 == 2) {
                            eg.o();
                            return null;
                        }
                        if (z) {
                            i3 = 2131231083;
                        } else {
                            i3 = 2131231086;
                        }
                    } else if (z) {
                        i3 = 2131231082;
                    } else {
                        i3 = 2131231085;
                    }
                } else if (z) {
                    i3 = 2131231081;
                } else {
                    i3 = 2131231084;
                }
                avc avcVar2 = new avc(i3, (Integer) null, 240.0f, 240.0f, 0);
                if (z) {
                    j80Var = new i80(str);
                } else {
                    if (i != 1) {
                        if (z3) {
                        }
                        j80Var = new j80(null, str, null);
                    } else {
                        if (z3) {
                        }
                        j80Var = new j80(null, str, null);
                    }
                    apdVar = new apd(kwcVar3, kwcVar, avcVar2, j80Var2, null, null, 224);
                }
                j80Var2 = j80Var;
                apdVar = new apd(kwcVar3, kwcVar, avcVar2, j80Var2, null, null, 224);
            } else {
                str2 = "template_render";
                apdVar = null;
            }
            if (apdVar != null) {
                dpd dpdVar = hf81Var.b;
                List listU = w6d1.u((List) arrayList, i6, dpd.e(dpdVar, null, w6d1.u(dpdVar.b, i7, apdVar), 1021));
                if ((wqn0Var3 instanceof tpn0) && ((k84) ((l7m0) h0yVar.b).b).q()) {
                    Object objT0 = o7h.t0(i6, listU);
                    dpd dpdVar2 = objT0 instanceof dpd ? (dpd) objT0 : null;
                    if (dpdVar2 == null) {
                        arrayList2 = listU;
                    } else {
                        if (w6d1.f(dpdVar2, Integer.valueOf(i7))) {
                            numValueOf = Integer.valueOf(i6);
                        } else {
                            Iterator it2 = o7h.k0(p7h.K(listU), i6 + 1).iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                            } while (!w6d1.f((fpd) listU.get(((Number) next).intValue()), (Integer) null));
                            numValueOf = (Integer) next;
                        }
                        if (numValueOf != null) {
                            int iIntValue = numValueOf.intValue();
                            Object obj2 = listU.get(iIntValue);
                            dpd dpdVar3 = obj2 instanceof dpd ? (dpd) obj2 : null;
                            if (dpdVar3 == null) {
                                n57.s("[CAL] Retaining artist sections because popular tracks are not a list");
                            } else {
                                List listSingletonList = Collections.singletonList(apdVar);
                                Integer numValueOf2 = Integer.valueOf(i7);
                                if (iIntValue != i6) {
                                    numValueOf2 = null;
                                }
                                List list3 = dpdVar3.b;
                                ArrayList arrayList6 = new ArrayList();
                                int i8 = 0;
                                for (Object obj3 : list3) {
                                    int i9 = i8 + 1;
                                    if (i8 < 0) {
                                        p7h.T();
                                        throw null;
                                    }
                                    apd apdVar2 = (apd) obj3;
                                    if (numValueOf2 == null || i8 != numValueOf2.intValue()) {
                                        p80 p80Var = apdVar2.d;
                                        j80 j80Var5 = p80Var instanceof j80 ? (j80) p80Var : null;
                                        if ((j80Var5 != null ? j80Var5.b : null) != null) {
                                            arrayList6.add(obj3);
                                        }
                                    }
                                    i8 = i9;
                                }
                                dpd dpdVarE = dpd.e(dpdVar2, null, o7h.N0(arrayList6, listSingletonList), 1020);
                                arrayList2 = new ArrayList();
                                int i10 = 0;
                                for (Object obj4 : listU) {
                                    int i11 = i10 + 1;
                                    if (i10 < 0) {
                                        p7h.T();
                                        throw null;
                                    }
                                    fpd fpdVar2 = (fpd) obj4;
                                    if (i10 == i6) {
                                        fpdVar2 = dpdVarE;
                                    } else if (i10 == iIntValue) {
                                        fpdVar2 = null;
                                    }
                                    if (fpdVar2 != null) {
                                        arrayList2.add(fpdVar2);
                                    }
                                    i10 = i11;
                                }
                            }
                        } else {
                            v8i0.j("[CAL] Retaining artist sections because no popular tracks are available for artist URI ", str4);
                        }
                        arrayList2 = 0;
                    }
                    if (arrayList2 != 0) {
                        r8 = arrayList2;
                    }
                } else {
                    r8 = listU;
                }
            }
            ArrayList arrayListG = ed10.g(qpyVar2);
            String str6 = dnyVar.b;
            Action action = Action.BACK;
            List list4 = dnyVar.e;
            boolean z11 = dnyVar.g;
            int i12 = dnyVar.i.a;
            w3wVar = new w3w(qpyVar2, dnyVar, (byte) 23);
            num = -16777216;
            List<ccy> list5 = list4;
            arrayList3 = new ArrayList(q7h.U(list5, 10));
            for (ccy ccyVar : list5) {
                z5 = ccyVar instanceof acy;
                if (z5 || !z11) {
                    fvcVarB = ccyVar.b();
                } else {
                    fvcVarB = new fvc(2131232287, (String) null, new mmr0(num, num), 2);
                }
                arrayList3.add(x1p1.d((kwc) null, fvcVarB, ccyVar.c(), z5, new k7a1(w3wVar, ccyVar, (byte) 27), 16));
                num = num;
            }
            Header headerQ = x1p1.q(str6, action, arrayList3);
            arrayList4 = new ArrayList();
            i4 = 0;
            r9 = r8;
            for (Object obj5 : (Iterable) r8) {
                i5 = i4 + 1;
                if (i4 >= 0) {
                    p7h.T();
                    throw null;
                }
                fpdVar = (fpd) obj5;
                if (i4 == p7h.L((List) r9)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                ouk0 ouk0Var = new ouk0(Integer.valueOf(i4), fpdVar.getId(), fpdVar.getUri(), qpyVar2.c1);
                r6h1 r6h1Var = qpyVar2.c1;
                ?? r22 = r9;
                lh2 lh2Var = new lh2(3, qpyVar2, qpy.class, "itemTappedCallback", "itemTappedCallback(Lcom/spotify/carapplibrary/api/CarAppMediaItem;ILcom/spotify/ubi/specification/factories/MobileCarapplibrarySectionEventFactory;)V", 0, (byte) 4);
                qpy qpyVar3 = qpyVar2;
                vhd vhdVar = qpyVar3.Y0;
                id = fpdVar.getId();
                if (id == null) {
                    id = fpdVar.getUri();
                }
                String str7 = id;
                List items = fpdVar.getItems();
                arrayList5 = new ArrayList(q7h.U(items, 10));
                it = items.iterator();
                while (it.hasNext()) {
                    arrayList5.add(l0p1.l((apd) it.next()));
                }
                int i13 = i4;
                utj utjVar = new utj(i13, r6h1Var, lh2Var, vhdVar.d(i13, str7, arrayList5, z4, new djx(qpyVar3, ouk0Var, fpdVar, (byte) 4)), null, null);
                cceVar = qpyVar3.W0;
                wqn0Var = qpyVar3.Q0;
                t7yVar = (t7y) cceVar.b;
                if (((k84) ((l7m0) cceVar.c).b).l()) {
                    iti1Var = new l6w0(cceVar.v(), cceVar.u(wqn0Var instanceof nqn0), t7yVar.o(5));
                } else if (!(wqn0Var instanceof xpn0) || (wqn0Var instanceof nqn0) || wqn0Var.equals(uqn0.a) || wqn0Var.equals(qqn0.a) || wqn0Var.equals(pqn0.a) || wqn0Var.equals(vqn0.a) || wqn0Var.equals(rqn0.a) || wqn0Var.equals(sqn0.a)) {
                    iti1Var = new iti1(cceVar.v(), (l7m0) cceVar.d, cceVar.u(wqn0Var instanceof nqn0));
                } else {
                    iti1Var = new vhd((l7m0) cceVar.d, t7yVar.o(5), 2);
                }
                r7h.W(iti1Var.c(fpdVar, utjVar), arrayList4);
                qpyVar2 = qpyVar3;
                i4 = i5;
                r9 = r22;
            }
            qpyVar = qpyVar2;
            boolean z12 = !(qpyVar.Q0 instanceof nqn0);
            pj51 pj51Var = new pj51();
            pj51Var.c = headerQ;
            pj51Var.a = arrayList4;
            pj51Var.d = false;
            pj51Var.b(arrayListG);
            pj51Var.e = z12;
            SectionedItemTemplate sectionedItemTemplateA = pj51Var.a();
            t45Var = qpyVar.a1;
            if (t45Var != null) {
                t45Var.g(str2);
                qpyVar.V0.b(t45Var.e());
            }
            qpyVar.a1 = null;
            return sectionedItemTemplateA;
        }
        str2 = "template_render";
        r8 = arrayList;
        ArrayList arrayListG2 = ed10.g(qpyVar2);
        String str8 = dnyVar.b;
        Action action2 = Action.BACK;
        List list6 = dnyVar.e;
        boolean z13 = dnyVar.g;
        int i14 = dnyVar.i.a;
        w3wVar = new w3w(qpyVar2, dnyVar, (byte) 23);
        num = -16777216;
        List<ccy> list7 = list6;
        arrayList3 = new ArrayList(q7h.U(list7, 10));
        while (r4.hasNext()) {
            z5 = ccyVar instanceof acy;
            if (z5) {
                fvcVarB = ccyVar.b();
            } else {
                fvcVarB = ccyVar.b();
            }
            arrayList3.add(x1p1.d((kwc) null, fvcVarB, ccyVar.c(), z5, new k7a1(w3wVar, ccyVar, (byte) 27), 16));
            num = num;
        }
        Header headerQ2 = x1p1.q(str8, action2, arrayList3);
        arrayList4 = new ArrayList();
        i4 = 0;
        r9 = r8;
        while (r12.hasNext()) {
            i5 = i4 + 1;
            if (i4 >= 0) {
                p7h.T();
                throw null;
            }
            fpdVar = (fpd) obj5;
            if (i4 == p7h.L((List) r9)) {
                z4 = true;
            } else {
                z4 = false;
            }
            ouk0 ouk0Var2 = new ouk0(Integer.valueOf(i4), fpdVar.getId(), fpdVar.getUri(), qpyVar2.c1);
            r6h1 r6h1Var2 = qpyVar2.c1;
            ?? r23 = r9;
            lh2 lh2Var2 = new lh2(3, qpyVar2, qpy.class, "itemTappedCallback", "itemTappedCallback(Lcom/spotify/carapplibrary/api/CarAppMediaItem;ILcom/spotify/ubi/specification/factories/MobileCarapplibrarySectionEventFactory;)V", 0, (byte) 4);
            qpy qpyVar4 = qpyVar2;
            vhd vhdVar2 = qpyVar4.Y0;
            id = fpdVar.getId();
            if (id == null) {
                id = fpdVar.getUri();
            }
            String str9 = id;
            List items2 = fpdVar.getItems();
            arrayList5 = new ArrayList(q7h.U(items2, 10));
            it = items2.iterator();
            while (it.hasNext()) {
                arrayList5.add(l0p1.l((apd) it.next()));
            }
            int i15 = i4;
            utj utjVar2 = new utj(i15, r6h1Var2, lh2Var2, vhdVar2.d(i15, str9, arrayList5, z4, new djx(qpyVar4, ouk0Var2, fpdVar, (byte) 4)), null, null);
            cceVar = qpyVar4.W0;
            wqn0Var = qpyVar4.Q0;
            t7yVar = (t7y) cceVar.b;
            if (((k84) ((l7m0) cceVar.c).b).l()) {
                iti1Var = new l6w0(cceVar.v(), cceVar.u(wqn0Var instanceof nqn0), t7yVar.o(5));
            } else if (wqn0Var instanceof xpn0) {
                iti1Var = new iti1(cceVar.v(), (l7m0) cceVar.d, cceVar.u(wqn0Var instanceof nqn0));
            } else {
                iti1Var = new iti1(cceVar.v(), (l7m0) cceVar.d, cceVar.u(wqn0Var instanceof nqn0));
            }
            r7h.W(iti1Var.c(fpdVar, utjVar2), arrayList4);
            qpyVar2 = qpyVar4;
            i4 = i5;
            r9 = r23;
        }
        qpyVar = qpyVar2;
        boolean z14 = !(qpyVar.Q0 instanceof nqn0);
        pj51 pj51Var2 = new pj51();
        pj51Var2.c = headerQ2;
        pj51Var2.a = arrayList4;
        pj51Var2.d = false;
        pj51Var2.b(arrayListG2);
        pj51Var2.e = z14;
        SectionedItemTemplate sectionedItemTemplateA2 = pj51Var2.a();
        t45Var = qpyVar.a1;
        if (t45Var != null) {
            t45Var.g(str2);
            qpyVar.V0.b(t45Var.e());
        }
        qpyVar.a1 = null;
        return sectionedItemTemplateA2;
    }

    @Override // p.xvc
    public final Function0 e() {
        return this.d1;
    }

    @Override // p.xvc
    public final wqn0 f() {
        return this.Q0;
    }

    @Override // p.ed10
    public final r6h1 h() {
        return this.c1;
    }

    public final py9 i() {
        py9 py9Var = this.b1;
        if (py9Var == null) {
            n57.e("[CAL] entityEventFactory is null for " + rc11.a.b(this.Q0.getClass()).r());
        }
        return py9Var;
    }

    public final jpk0 j(dny dnyVar, String str) {
        py9 py9VarI = i();
        if (py9VarI == null) {
            return null;
        }
        int iC = l1d.C(dnyVar.i.a);
        int i = 1;
        if (iC != 0) {
            if (iC == 1) {
                i = 2;
            } else {
                if (iC != 2) {
                    eg.o();
                    return null;
                }
                i = 3;
            }
        }
        return new jpk0(py9VarI, i, str);
    }

    @Override // p.xvc
    public final void onPause(iac0 iac0Var) {
        super.onPause(iac0Var);
        this.a1 = null;
    }

    @Override // p.xvc
    public final void onResume(iac0 iac0Var) {
        super.onResume(iac0Var);
        ((LinkedHashMap) this.Y0.d).clear();
        t45 t45VarA = this.V0.a("screen_render_time");
        t45.m(t45VarA, "template_render", 4);
        t45VarA.h = "carapplibrary";
        t45VarA.a("screen_type", "entity");
        t45VarA.a("async_image_loading_enabled", AndroidServicebasedrouterProperties$TestHelper.TRUE);
        this.a1 = t45VarA;
    }
}
