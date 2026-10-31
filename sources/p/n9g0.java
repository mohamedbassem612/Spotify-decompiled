package p;

import com.spotify.libraryimportservice.tmm.UnmatchedItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n9g0 extends hab0 implements iu30 {
    public final /* synthetic */ Object N0;
    public final /* synthetic */ Object O0;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9g0(bx bxVar, iu30 iu30Var, fli0 fli0Var, ba50 ba50Var, ob9 ob9Var, f2f0 f2f0Var, dh51 dh51Var, h7l h7lVar, es00 es00Var, nyr0 nyr0Var, sij1 sij1Var, fkn0 fkn0Var, mwa mwaVar, hx hxVar) {
        super(1);
        this.c = bxVar;
        this.b = iu30Var;
        this.d = fli0Var;
        this.e = ba50Var;
        this.f = ob9Var;
        this.g = f2f0Var;
        this.h = dh51Var;
        this.i = h7lVar;
        this.t = es00Var;
        this.X = nyr0Var;
        this.Y = sij1Var;
        this.Z = fkn0Var;
        this.N0 = mwaVar;
        this.O0 = hxVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0196  */
    /* JADX WARN: Code duplicated, block: B:44:0x01aa A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x0196, please report this as an issue */
    public final Object invoke(Object obj) {
        p410 p410Var;
        String str;
        mah0 mah0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.O0;
        Object obj3 = this.N0;
        Object obj4 = this.Z;
        Object obj5 = this.Y;
        Object obj6 = this.X;
        Object obj7 = this.t;
        Object obj8 = this.i;
        Object obj9 = this.h;
        Object obj10 = this.g;
        Object obj11 = this.f;
        Object obj12 = this.d;
        iu30 iu30Var = this.b;
        Object obj13 = this.c;
        Object obj14 = this.e;
        switch (b) {
            case 0:
                rtb0 rtb0Var = (rtb0) obj;
                fli0 fli0Var = (fli0) obj12;
                bx bxVar = (bx) obj13;
                rtb0.c(rtb0Var, "headerElements", new j2i(-997180105, new c9y(fli0Var, bxVar, (ba50) obj14, (ob9) obj11, (byte) 11), true), 2);
                rtb0.c(rtb0Var, "loginOptionsRowElement", new j2i(928917550, new h6a0((f2f0) obj10, bxVar, (byte) 26), true), 2);
                dh51 dh51Var = (dh51) obj9;
                rtb0.c(rtb0Var, "playbackSectionHeader", new j2i(1105245807, new v0c0(dh51Var, (byte) 1), true), 2);
                if (bxVar.e) {
                    rtb0.c(rtb0Var, "connectToggleRowElement", new j2i(1753862994, new h6a0((h7l) obj8, bxVar, (byte) 27), true), 2);
                }
                rtb0.c(rtb0Var, "explicitContentToggleRowElement", new j2i(1281574064, new h6a0((es00) obj7, bxVar, (byte) 28), true), 2);
                rtb0.c(rtb0Var, "parentalHubRowElement", new j2i(1457902321, new iwf0((nyr0) obj6, bxVar, fli0Var, (byte) 6), true), 2);
                rtb0.c(rtb0Var, "videoContentToggleRowElement", new j2i(1634230578, new h6a0((sij1) obj5, bxVar, (byte) 29), true), 2);
                rtb0.c(rtb0Var, "divider1", wyi.a, 2);
                rtb0.c(rtb0Var, "accountSectionHeader", new j2i(1986887092, new v0c0(dh51Var, (byte) 2), true), 2);
                rtb0.c(rtb0Var, "nameRowElement", new j2i(-2131751947, new w0c0((fkn0) obj4, fli0Var, (byte) 1), true), 2);
                rtb0.c(rtb0Var, "birthdayRowElement", new j2i(-1955423690, new iwf0((mwa) obj3, bxVar, fli0Var, (byte) 5), true), 2);
                rtb0.c(rtb0Var, "accountTypeRowElement", new j2i(-252622352, new x0c0((hx) obj2, (byte) 1), true), 2);
                rtb0.c(rtb0Var, "divider2", wyi.b, 2);
                iu30Var.invoke(rtb0Var);
                return rih1Var;
            default:
                rtb0 rtb0Var2 = (rtb0) obj;
                mah0 mah0Var2 = (mah0) obj14;
                rtb0.c(rtb0Var2, "page_title", new j2i(1549797830, new otf0(mah0Var2, (byte) 13), true), 2);
                ArrayList arrayList = (ArrayList) obj13;
                if (arrayList.size() > 1) {
                    rtb0.f(rtb0Var2, "filters", new j2i(-758490899, new gk0(mah0Var2, arrayList, iu30Var, (byte) 18), true), 2);
                }
                List list = (List) obj12;
                bbh0 bbh0Var = (bbh0) obj11;
                iu30 iu30Var2 = (iu30) obj10;
                iu30 iu30Var3 = (iu30) obj9;
                iu30 iu30Var4 = (iu30) obj8;
                String str2 = (String) obj7;
                p410 p410Var2 = (p410) obj6;
                String str3 = (String) obj5;
                iu30 iu30Var5 = (iu30) obj4;
                iu30 iu30Var6 = (iu30) obj3;
                xu30 xu30Var = (xu30) obj2;
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    bbh0 bbh0Var2 = (bbh0) next;
                    String str4 = "header_" + bbh0Var2;
                    c9y c9yVar = new c9y(bbh0Var2, bbh0Var, iu30Var2, iu30Var3, (byte) 12);
                    Iterator it2 = it;
                    xu30 xu30Var2 = xu30Var;
                    bbh0 bbh0Var3 = bbh0Var;
                    iu30 iu30Var7 = iu30Var2;
                    iu30 iu30Var8 = iu30Var3;
                    iu30 iu30Var9 = iu30Var6;
                    iu30 iu30Var10 = iu30Var5;
                    String str5 = str3;
                    rtb0.c(rtb0Var2, str4, new j2i(640364341, c9yVar, true), 2);
                    z6x z6xVar = (List) mah0Var2.a.get(bbh0Var2);
                    if (z6xVar == null) {
                        z6xVar = z6x.a;
                    }
                    if (bbh0Var2 == bbh0.c) {
                        p410Var = p410Var2;
                        str = str2;
                        rtb0Var2.e(z6xVar.size(), new ehf0(z6xVar, (byte) 9), new ehf0(z6xVar, (byte) 10), new j2i(802480018, new sf1(z6xVar, (byte) 3), true));
                    } else {
                        p410Var = p410Var2;
                        str = str2;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj15 : (Iterable) z6xVar) {
                            if (!mah0Var2.f(((UnmatchedItem) obj15).getId())) {
                                arrayList2.add(obj15);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            rtb0.c(rtb0Var2, "empty_" + bbh0Var2, new j2i(-658737228, new u40(iu30Var4, z6xVar), true), 2);
                        } else {
                            mah0Var = mah0Var2;
                            rtb0Var2.e(arrayList2.size(), new qbb0(arrayList2, (byte) 8), new qbb0(arrayList2, (byte) 9), new j2i(802480018, new hkn(arrayList2, mah0Var, str, p410Var, str5, iu30Var10, iu30Var9, xu30Var2), true));
                        }
                        if (i < p7h.L(list)) {
                            rtb0.c(rtb0Var2, "divider_" + bbh0Var2, rzi.a, 2);
                        }
                        it = it2;
                        i = i2;
                        mah0Var2 = mah0Var;
                        str2 = str;
                        p410Var2 = p410Var;
                        str3 = str5;
                        iu30Var5 = iu30Var10;
                        iu30Var6 = iu30Var9;
                        xu30Var = xu30Var2;
                        iu30Var3 = iu30Var8;
                        bbh0Var = bbh0Var3;
                        iu30Var2 = iu30Var7;
                    }
                    mah0Var = mah0Var2;
                    if (i < p7h.L(list)) {
                        rtb0.c(rtb0Var2, "divider_" + bbh0Var2, rzi.a, 2);
                    }
                    it = it2;
                    i = i2;
                    mah0Var2 = mah0Var;
                    str2 = str;
                    p410Var2 = p410Var;
                    str3 = str5;
                    iu30Var5 = iu30Var10;
                    iu30Var6 = iu30Var9;
                    xu30Var = xu30Var2;
                    iu30Var3 = iu30Var8;
                    bbh0Var = bbh0Var3;
                    iu30Var2 = iu30Var7;
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9g0(ArrayList arrayList, List list, mah0 mah0Var, iu30 iu30Var, bbh0 bbh0Var, iu30 iu30Var2, iu30 iu30Var3, iu30 iu30Var4, String str, p410 p410Var, String str2, iu30 iu30Var5, iu30 iu30Var6, xu30 xu30Var) {
        super(1);
        this.c = arrayList;
        this.d = list;
        this.e = mah0Var;
        this.b = iu30Var;
        this.f = bbh0Var;
        this.g = iu30Var2;
        this.h = iu30Var3;
        this.i = iu30Var4;
        this.t = str;
        this.X = p410Var;
        this.Y = str2;
        this.Z = iu30Var5;
        this.N0 = iu30Var6;
        this.O0 = xu30Var;
    }
}
