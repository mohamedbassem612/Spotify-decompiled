package p;

import android.hardware.SensorManager;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.MobiusLoop;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w9d0 implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w9d0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final void dispose() {
        Object value;
        boolean z = false;
        switch (this.a) {
            case 0:
                ((x8c0) this.b).d((x9d0) this.c);
                break;
            case 1:
                ((ymd0) this.b).k((q1d) this.c);
                break;
            case 2:
                ((m0g0) this.b).b.a((l7p0) this.c);
                break;
            case 3:
                p410 p410Var = (p410) this.b;
                if (u890.j(((tah0) ((bpb1) p410Var.g).getValue()).a, (String) this.c)) {
                    p410Var.D();
                }
                break;
            case 4:
                ((iac0) this.b).getLifecycle().d((x9d0) this.c);
                break;
            case 5:
                ((View) this.b).removeOnLayoutChangeListener((sau) this.c);
                break;
            case 6:
                ((der0) this.b).getClass();
                ((air0) this.c).a();
                break;
            case 7:
                ((jc9) this.b).q((ghr0) this.c);
                break;
            case 8:
                bpb1 bpb1Var = ((oyx) this.b).b;
                do {
                    value = bpb1Var.getValue();
                } while (!bpb1Var.k(value, o7h.J0((List) value, (k6w0) this.c)));
                break;
            case 9:
                ofw0 ofw0Var = (ofw0) this.b;
                jqd0 jqd0Var = (jqd0) this.c;
                if (ofw0Var.r == jqd0Var) {
                    ofw0Var.r = null;
                }
                if (!jqd0Var.b) {
                    jqd0Var.b = true;
                    qfw0 qfw0Var = (qfw0) ((MobiusLoop) jqd0Var.c).i;
                    if (qfw0Var != null && qfw0Var.c()) {
                        z = true;
                    }
                    ((MobiusLoop) jqd0Var.c).a(cew0.a);
                    ((MobiusLoop) jqd0Var.c).dispose();
                    ((pdw0) jqd0Var.d).c();
                    if (z) {
                        ofw0Var.g.b();
                    }
                    bpb1 bpb1Var2 = ofw0Var.o;
                    Boolean bool = Boolean.FALSE;
                    bpb1Var2.m((Object) null, bool);
                    ofw0Var.p.m((Object) null, bool);
                    bpb1 bpb1Var3 = ofw0Var.q;
                    if (bpb1Var3.getValue() != null) {
                        bpb1Var3.m((Object) null, pfw0.a);
                    }
                    break;
                }
                break;
            case 10:
                ((x8c0) this.b).d((f0x0) this.c);
                break;
            case 11:
                Iterator it = ((List) this.b).iterator();
                while (it.hasNext()) {
                    ((z511) it.next()).z((v01) this.c);
                }
                break;
            case 12:
                ((InputMethodManager) this.b).hideSoftInputFromWindow((IBinder) this.c, 0);
                break;
            case 13:
                e201 e201Var = (e201) this.c;
                MobiusLoop.Controller controller = (MobiusLoop.Controller) this.b;
                if (((l201) controller.a()).a instanceof gbe0) {
                    m201 m201Var = e201Var.a;
                    l201 l201Var = (l201) controller.a();
                    l201Var.getClass();
                    l201 l201VarA = l201.a(l201Var, (cce0) null, (String) null, (String) null, 0, 13);
                    frd1 frd1Var = e201Var.b;
                    String str = e201Var.c;
                    if (str == null) {
                        str = "";
                    }
                    LinkedHashMap linkedHashMap = m201Var.a;
                    linkedHashMap.clear();
                    linkedHashMap.put(frd1Var + str, l201VarA);
                }
                controller.stop();
                controller.disconnect();
                break;
            case 14:
                y0i y0iVar = (y0i) this.b;
                z0i z0iVar = (z0i) this.c;
                LinkedHashMap linkedHashMap2 = y0iVar.c;
                xm90 xm90Var = (xm90) linkedHashMap2.get(z0iVar);
                if (xm90Var != null) {
                    xm90Var.a(n1i.a);
                }
                linkedHashMap2.remove(z0iVar);
                break;
            case 15:
                ((x8c0) this.b).d((x9d0) this.c);
                break;
            case 16:
                ((x8c0) this.b).d((x9d0) this.c);
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((SensorManager) this.b).unregisterListener((du91) this.c);
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((oe41) this.b).e((String) this.c);
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((iac0) this.b).getLifecycle().d((it0) this.c);
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.b;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.D((qzb1) this.c);
                }
                break;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ven0 ven0Var = (ven0) this.b;
                r9w0 r9w0Var = (r9w0) ven0Var.getValue();
                if (r9w0Var != null) {
                    q9w0 q9w0Var = new q9w0(r9w0Var);
                    idn0 idn0Var = (idn0) this.c;
                    if (idn0Var != null) {
                        idn0Var.a(q9w0Var);
                    }
                    ven0Var.setValue((Object) null);
                }
                break;
            case 22:
                ((oae1) this.b).c.remove((iu30) this.c);
                break;
            case 23:
                ((SensorManager) this.b).unregisterListener((uie1) this.c);
                break;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((SensorManager) this.b).unregisterListener((uie1) this.c);
                break;
            case 25:
                sme1 sme1Var = ((ane1) this.b).k;
                ven0 ven0Var2 = (ven0) this.c;
                t480 t480Var = (t480) ven0Var2.getValue();
                if (t480Var != null) {
                    sme1Var.b.o(t480Var, sme1.d);
                }
                ven0Var2.setValue((Object) null);
                break;
            case 26:
                ((mhg1) this.b).k.remove((bjg1) this.c);
                break;
            case 27:
                mhg1 mhg1Var = (mhg1) this.b;
                zgg1 zgg1Var = (zgg1) this.c;
                mhg1Var.getClass();
                ygg1 ygg1VarC = zgg1Var.c();
                if (ygg1VarC != null) {
                    mhg1Var.j.remove(ygg1VarC.a);
                }
                break;
            case 28:
                ((mhg1) this.b).j.remove((fhg1) this.c);
                break;
            default:
                hgr0 hgr0Var = (hgr0) this.b;
                if (hgr0Var != null) {
                    ((skg1) this.c).d.a(hgr0Var);
                }
                break;
        }
    }
}
