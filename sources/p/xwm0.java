package p;

import android.view.Window;
import app.rive.ImageAsset;
import com.spotify.scrollsita.v1.Section;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xwm0 implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xwm0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void dispose() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                tm51 tm51Var = (tm51) obj;
                if (tm51Var != null) {
                    tm51Var.a.setValue((Object) null);
                    return;
                }
                return;
            case 1:
                ((n1k) obj).a.m((Object) null, Boolean.FALSE);
                return;
            case 2:
                ((x5b0) ((poj0) obj).d).a("now_playing_reference", z6x.a);
                return;
            case 3:
                ((akk1) obj).b = false;
                return;
            case 4:
                xf11 xf11Var = (xf11) obj;
                if (xf11Var != null) {
                    xf11Var.a();
                    return;
                }
                return;
            case 5:
                ((nwb) obj).c.invoke(ixb.c);
                return;
            case 6:
                ((shq0) obj).invoke();
                return;
            case 7:
                gpv0 gpv0Var = (gpv0) obj;
                if (gpv0Var != null) {
                    gpv0Var.f = null;
                }
                if (gpv0Var != null) {
                    gpv0Var.g = null;
                    return;
                }
                return;
            case 8:
                otf1 otf1Var = (otf1) obj;
                if (otf1Var != null) {
                    LinkedHashMap linkedHashMap = otf1Var.c;
                    Collection collectionValues = linkedHashMap.values();
                    idm1 idm1Var = otf1Var.a;
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        idm1Var.c((t480) it.next());
                    }
                    linkedHashMap.clear();
                    return;
                }
                return;
            case 9:
                ((gnv0) obj).e();
                return;
            case 10:
                gfw0 gfw0Var = (gfw0) obj;
                gfw0Var.K = 3;
                sbw0 sbw0Var = gfw0Var.v;
                if (sbw0Var != null) {
                    gfw0Var.s(sbw0Var);
                    return;
                } else {
                    gfw0Var.w();
                    return;
                }
            case 11:
                kt91 kt91Var = (kt91) obj;
                m6w0 m6w0Var = (m6w0) kt91Var.i.a.getValue();
                if (m6w0Var == null || !m6w0Var.a().h()) {
                    return;
                }
                kt91Var.b();
                return;
            case 12:
                ((m2y0) obj).h.b.l(rih1.a);
                return;
            case 13:
                ((tso) ((ewe) obj).g).a.e = null;
                return;
            case 14:
                ((q401) obj).c.l();
                return;
            case 15:
                qb01 qb01Var = (qb01) obj;
                bbc bbcVar = qb01Var.e;
                if (bbcVar == null) {
                    return;
                }
                qb01Var.b.d(qb01Var);
                qb01Var.b(new kb01(qb01Var, bbcVar, null));
                qb01Var.e = null;
                return;
            case 16:
                ((oa11) obj).f();
                return;
            case 17:
                ((bm11) obj).b.c();
                return;
            case 18:
                xab1 xab1Var = ((ys50) obj).d;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                    return;
                }
                return;
            case 19:
                rkb rkbVar = (rkb) obj;
                if (rkbVar != null) {
                    rkbVar.b.destroy();
                    rkbVar.a.destroy();
                    return;
                }
                return;
            case 20:
                vk21 vk21Var = (vk21) obj;
                gw91 gw91Var = vk21Var.c;
                gw91Var.b(vk21Var.b);
                dt30 dt30Var = vk21Var.a;
                if (!dt30Var.c()) {
                    dt30Var.d();
                }
                gw91Var.a();
                gw91Var.f();
                return;
            case 21:
                ((jf31) obj).d.c();
                return;
            case 22:
                ((jfe) obj).H((Throwable) null);
                return;
            case 23:
                Map map = (Map) obj;
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    ((ImageAsset) it2.next()).close();
                }
                map.clear();
                return;
            case 24:
                ((a0c) obj).d(false);
                return;
            case 25:
                ((u651) obj).e.a = oa41.P0;
                return;
            case 26:
                ((Window) obj).clearFlags(128);
                return;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ((rzq) obj).l();
                return;
            case 28:
                c0r c0rVar = ((dpb1) obj).a;
                if (c0rVar != null) {
                    c0rVar.dispose();
                    return;
                }
                return;
            default:
                tva1 tva1Var = (tva1) obj;
                k740 k740Var = (k740) tva1Var.P0;
                if (k740Var == null) {
                    u890.C("gatedContentService");
                    throw null;
                }
                k740Var.e();
                stt0 stt0Var = (stt0) tva1Var.Q0;
                if (stt0Var != null) {
                    stt0Var.d();
                    return;
                } else {
                    u890.C("playabilityService");
                    throw null;
                }
        }
    }
}
