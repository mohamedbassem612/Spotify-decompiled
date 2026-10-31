package p;

import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import app.p000rive.runtime.kotlin.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class u1c implements iu30 {
    public final /* synthetic */ byte a;

    public /* synthetic */ u1c(byte b) {
        this.a = b;
    }

    public final Object invoke(Object obj) throws Exception {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return rih1Var;
            case 1:
                b261.x((e261) obj, 0);
                return rih1Var;
            case 2:
                b261.x((e261) obj, 0);
                return rih1Var;
            case 3:
                b261.x((e261) obj, 0);
                return rih1Var;
            case 4:
                return rih1Var;
            case 5:
                htr0 htr0Var = (htr0) ((dpg1) obj);
                htr0Var.P0 = false;
                nko1.C(htr0Var);
                return Boolean.FALSE;
            case 6:
                return rih1Var;
            case 7:
                d441 d441VarG1 = ((y341) obj).g1("DELETE FROM device_broadcasts");
                try {
                    d441VarG1.f1();
                    return rih1Var;
                } finally {
                    d441VarG1.close();
                }
            case 8:
                d441 d441VarG2 = ((y341) obj).g1("SELECT * FROM device_broadcasts");
                try {
                    int iW = y7y0.w(d441VarG2, "id");
                    int iW2 = y7y0.w(d441VarG2, "from");
                    int iW3 = y7y0.w(d441VarG2, "deviceId");
                    int iW4 = y7y0.w(d441VarG2, "createdAt");
                    ArrayList arrayList = new ArrayList();
                    while (d441VarG2.f1()) {
                        arrayList.add(new nvg(d441VarG2.isNull(iW) ? null : Integer.valueOf((int) d441VarG2.getLong(iW)), d441VarG2.isNull(iW2) ? null : d441VarG2.P0(iW2), d441VarG2.isNull(iW3) ? null : d441VarG2.P0(iW3), d441VarG2.isNull(iW4) ? null : Long.valueOf(d441VarG2.getLong(iW4))));
                        break;
                    }
                    return arrayList;
                } finally {
                    d441VarG2.close();
                }
            case 9:
                ((Long) obj).getClass();
                return rih1Var;
            case 10:
                return Boolean.valueOf(!(((oim0) obj) instanceof a0k));
            case 11:
                xos0 xos0Var = (xos0) obj;
                kiv kivVar = qw60.a;
                xos0Var.getClass();
                View view = ((vhk1) d7e.x(xos0Var, kivVar)).a;
                while (view != null) {
                    Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
                    if (tag != null) {
                        return tag;
                    }
                    Object objP = dm5.P(view);
                    view = objP instanceof View ? (View) objP : null;
                }
                return null;
            case 12:
                return rih1Var;
            case 13:
                q8n q8nVar = (m8n) obj;
                if (q8nVar instanceof q8n) {
                    return q8nVar;
                }
                return null;
            case 14:
                Map.Entry entry = (Map.Entry) obj;
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                }
                sb.append(value);
                return sb.toString();
            case 15:
                b261.F((e261) obj, true);
                return rih1Var;
            case 16:
                b261.F((e261) obj, true);
                return rih1Var;
            case 17:
                return rih1Var;
            case 18:
                return Boolean.valueOf(t890.j(obj));
            case 19:
                return rih1Var;
            case 20:
                return rih1Var;
            case 21:
                return Boolean.TRUE;
            case 22:
                return Boolean.TRUE;
            case 23:
                return Boolean.TRUE;
            case 24:
                return Boolean.FALSE;
            case 25:
                return rih1Var;
            case 26:
                return rih1Var;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return rih1Var;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return rih1Var;
            default:
                return new pi30((ven0) obj);
        }
    }
}
