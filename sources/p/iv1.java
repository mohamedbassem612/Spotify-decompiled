package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class iv1 implements acr0 {
    public final /* synthetic */ byte a;
    public final Set b;

    public iv1(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = Collections.singleton(ghl1.d);
                break;
            default:
                this.b = Collections.singleton(fxu0.d);
                break;
        }
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return wu1.class;
            default:
                return bhl1.class;
        }
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        ArrayList<String> arrayList;
        switch (this.a) {
            case 0:
                String str = th61Var.a;
                zu1 parcelableExtra = intent.getParcelableExtra("folder");
                String stringExtra = intent.getStringExtra("source_view_uri");
                String str2 = stringExtra == null ? "" : stringExtra;
                String stringExtra2 = intent.getStringExtra("source_context_uri");
                String str3 = stringExtra2 == null ? "" : stringExtra2;
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("added_item_uris");
                Set setP1 = stringArrayListExtra != null ? o7h.p1(stringArrayListExtra) : null;
                Set set = w7x.a;
                Set set2 = setP1 == null ? set : setP1;
                ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("item_uris");
                ArrayList<String> arrayList2 = z6x.a;
                if (stringArrayListExtra2 == null) {
                    stringArrayListExtra2 = arrayList2;
                }
                ArrayList<String> arrayList3 = stringArrayListExtra2;
                String strN = s4b1Var.n("item_uris");
                if (strN != null) {
                    List<String> listQ0 = ihc1.Q0(strN, new String[]{","}, 0, 6);
                    arrayList = new ArrayList<>();
                    for (String str4 : listQ0) {
                        Set set3 = s4b1.f;
                        String strZ = uic.x(str4).z();
                        if (strZ != null) {
                            arrayList.add(strZ);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    arrayList2 = arrayList;
                }
                ArrayList arrayListN0 = o7h.N0(arrayList2, arrayList3);
                ArrayList<String> stringArrayListExtra3 = intent.getStringArrayListExtra("removed_item_uris");
                Set setP2 = stringArrayListExtra3 != null ? o7h.p1(stringArrayListExtra3) : null;
                Set set4 = setP2 == null ? set : setP2;
                ay1 ay1Var = (gy1) intent.getParcelableExtra("use_case");
                if (ay1Var == null) {
                    ay1Var = ay1.a;
                }
                ay1 ay1Var2 = ay1Var;
                boolean booleanExtra = intent.getBooleanExtra("force_expanded", false);
                boolean booleanExtra2 = intent.getBooleanExtra("started_for_result", false);
                cy1 parcelableExtra2 = intent.getParcelableExtra("use_case");
                cy1 cy1Var = parcelableExtra2 instanceof cy1 ? parcelableExtra2 : null;
                Set setA = cy1Var != null ? cy1Var.a() : null;
                return new av1(str, parcelableExtra, str2, arrayListN0, str3, set2, booleanExtra2, set4, ay1Var2, booleanExtra, setA == null ? set : setA);
            default:
                return new dhl1();
        }
    }

    public final e6w0 d() {
        switch (this.a) {
            case 0:
                return new c6w0(2, true, (hd5) null, 12);
            default:
                return new b6w0(false);
        }
    }

    public final Set e() {
        byte b = this.a;
        return this.b;
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Add To Playlist";
            default:
                return "A bottom sheet upsell shown when a Wear OS user tries to download.";
        }
    }
}
