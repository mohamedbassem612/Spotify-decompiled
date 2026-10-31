package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class deb implements Update {
    public final /* synthetic */ feb a;

    public deb(feb febVar) {
        this.a = febVar;
    }

    public final Next a(Object obj, Object obj2) {
        geb gebVar = (geb) obj;
        udb udbVar = (udb) obj2;
        boolean z = this.a.c.I() && !hzd1.a;
        mgo1 mgo1Var = gebVar.b;
        fjt fjtVar = gebVar.a;
        String str = gebVar.d;
        boolean z2 = udbVar instanceof bdb;
        lyw lywVar = lyw.c;
        if (z2) {
            String str2 = ((bdb) udbVar).a;
            if (mgo1Var instanceof pyw) {
                return Next.j();
            }
            Set setSingleton = Collections.singleton(new nbb(str2));
            int iOrdinal = fjtVar.ordinal();
            pyw pywVar = pyw.c;
            if (iOrdinal == 0) {
                int iC = l1d.C(lde0.a(str2));
                if (iC == 0) {
                    return Next.i(geb.a(gebVar, pywVar, null, str2, 5), dm61.x0(new tbb(str2), setSingleton));
                }
                if (iC == 1) {
                    return Next.i(geb.a(gebVar, new myw(2), null, str2, 5), dm61.x0(new pbb("email_format_wrong"), setSingleton));
                }
                if (iC == 2) {
                    return Next.i(geb.a(gebVar, new myw(3), null, str2, 5), dm61.x0(new pbb("generic"), setSingleton));
                }
                eg.o();
                return null;
            }
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            if (ihc1.y0(str2)) {
                return Next.i(geb.a(gebVar, new myw(3), null, str2, 5), dm61.x0(new pbb("generic"), setSingleton));
            }
            if (!ihc1.h0(str2, "@", false)) {
                return z ? Next.i(geb.a(gebVar, pywVar, null, str2, 5), dm61.x0(new ubb(str2), setSingleton)) : Next.i(geb.a(gebVar, lywVar, null, str2, 5), dm61.x0(new hbb(str2), setSingleton));
            }
            int iC2 = l1d.C(lde0.a(str2));
            if (iC2 == 0) {
                return Next.i(geb.a(gebVar, pywVar, null, str2, 5), dm61.x0(new sbb(str2), setSingleton));
            }
            if (iC2 == 1 || iC2 == 2) {
                return Next.i(geb.a(gebVar, new myw(2), null, str2, 5), dm61.x0(new pbb("email_format_wrong"), setSingleton));
            }
            eg.o();
            return null;
        }
        if (udbVar instanceof kdb) {
            kdb kdbVar = (kdb) udbVar;
            return Next.a(Effects.a(new jbb[]{new jbb(new i3f0(kdbVar.a, kdbVar.b, kdbVar.c))}));
        }
        if (udbVar.equals(zcb.a)) {
            return mgo1Var instanceof lyw ? Next.j() : Next.h(geb.a(gebVar, lywVar, null, null, 13));
        }
        boolean zEquals = udbVar.equals(cdb.a);
        mbb mbbVar = mbb.a;
        if (zEquals) {
            return Next.i(geb.a(gebVar, lywVar, null, null, 13), Effects.a(new vbb[]{dbb.a, mbbVar}));
        }
        if (udbVar.equals(edb.a)) {
            return Next.i(geb.a(gebVar, lywVar, null, null, 13), Effects.a(new vbb[]{fbb.a, mbbVar, new lbb(fjtVar, str)}));
        }
        if (udbVar.equals(mdb.a)) {
            return Next.a(Effects.a(new lbb[]{new lbb(fjtVar, null)}));
        }
        if (udbVar.equals(fdb.a)) {
            return Next.a(Effects.a(new obb[]{obb.a}));
        }
        if (udbVar instanceof qdb) {
            qdb qdbVar = (qdb) udbVar;
            return Next.i(geb.a(gebVar, lywVar, null, null, 13), Effects.a(new ibb[]{new ibb(qdbVar.a, qdbVar.b)}));
        }
        if (udbVar.equals(ndb.a)) {
            return Next.i(geb.a(gebVar, iyw.c, null, null, 13), Effects.a(new vbb[]{new pbb("email_already_exist"), cbb.a}));
        }
        boolean zEquals2 = udbVar.equals(pdb.a);
        nyw nywVar = nyw.c;
        if (zEquals2) {
            return Next.i(geb.a(gebVar, nywVar, null, null, 13), Effects.a(new pbb[]{new pbb("generic")}));
        }
        if (udbVar.equals(odb.a)) {
            return Next.i(geb.a(gebVar, nywVar, null, null, 13), Effects.a(new pbb[]{new pbb("generic")}));
        }
        if (udbVar.equals(hdb.a)) {
            return Next.h(geb.a(gebVar, jyw.c, null, null, 13));
        }
        if (udbVar.equals(gdb.a)) {
            return Next.i(geb.a(gebVar, nywVar, null, null, 13), Effects.a(new pbb[]{new pbb("email_format_wrong")}));
        }
        if (udbVar.equals(ldb.a)) {
            return Next.h(geb.a(gebVar, null, jus0.b, null, 11));
        }
        if (udbVar.equals(adb.a)) {
            jus0 jus0Var = gebVar.c;
            jus0 jus0Var2 = jus0.a;
            return jus0Var == jus0Var2 ? Next.j() : Next.h(geb.a(gebVar, null, jus0Var2, null, 11));
        }
        if (udbVar.equals(wcb.a)) {
            geb gebVarA = geb.a(gebVar, lywVar, null, null, 13);
            if (str == null) {
                str = "";
            }
            return Next.i(gebVarA, Effects.a(new hbb[]{new hbb(str)}));
        }
        if (udbVar.equals(xcb.a)) {
            return Next.i(geb.a(gebVar, kyw.c, null, null, 13), Effects.a(new pbb[]{new pbb("email_not_linked")}));
        }
        if (udbVar.equals(ycb.a)) {
            geb gebVarA2 = geb.a(gebVar, lywVar, null, null, 13);
            if (str == null) {
                str = "";
            }
            return Next.i(gebVarA2, Effects.a(new hbb[]{new hbb(str)}));
        }
        if (udbVar.equals(rdb.a)) {
            geb gebVarA3 = geb.a(gebVar, lywVar, null, null, 13);
            if (str == null) {
                str = "";
            }
            return Next.i(gebVarA3, Effects.a(new hbb[]{new hbb(str)}));
        }
        if (udbVar instanceof sdb) {
            return Next.i(geb.a(gebVar, new oyw(((sdb) udbVar).a), null, null, 13), Effects.a(new rbb[]{rbb.a}));
        }
        if (udbVar.equals(tdb.a)) {
            geb gebVarA4 = geb.a(gebVar, lywVar, null, null, 13);
            pbb pbbVar = new pbb("error_endpoint_accountrecovery-v1_username-hint");
            if (str == null) {
                str = "";
            }
            return Next.i(gebVarA4, Effects.a(new vbb[]{pbbVar, new hbb(str)}));
        }
        if (udbVar.equals(ddb.a)) {
            return Next.i(geb.a(gebVar, lywVar, null, null, 13), Effects.a(new ebb[]{ebb.a}));
        }
        if (udbVar.equals(idb.a)) {
            return Next.i(geb.a(gebVar, lywVar, null, null, 13), Effects.a(new vbb[]{gbb.a, new lbb(fjtVar, str)}));
        }
        if (udbVar instanceof jdb) {
            return Next.a(Effects.a(new qbb[]{new qbb(((jdb) udbVar).a)}));
        }
        eg.o();
        return null;
    }
}
