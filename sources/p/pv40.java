package p;

import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class pv40 implements iu30 {
    public final /* synthetic */ byte a;

    public final Object invoke(Object obj) {
        zy31 zy31Var;
        z = false;
        boolean z = false;
        switch (this.a) {
            case 0:
                synchronized (pv91.c) {
                    List list = pv91.i;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((iu30) list.get(i)).invoke(obj);
                    }
                }
                return rih1.a;
            case 1:
                ((cy60) obj).getClass();
                return Boolean.TRUE;
            case 2:
                ((lsl) obj).s1();
                return rih1.a;
            case 3:
                return rih1.a;
            case 4:
                ((h4e1) obj).o(null);
                return rih1.a;
            case 5:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 6:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 7:
                char cCharValue = ((Character) obj).charValue();
                return Boolean.valueOf(cCharValue == 'T' || cCharValue == 't');
            case 8:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 9:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 10:
                char cCharValue2 = ((Character) obj).charValue();
                if ('0' <= cCharValue2 && cCharValue2 < ':') {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 11:
                Map.Entry entry = (Map.Entry) obj;
                String str = (String) entry.getKey();
                ega0 ega0Var = (ega0) entry.getValue();
                StringBuilder sb = new StringBuilder();
                ahc1.a(sb, str);
                sb.append(':');
                sb.append(ega0Var);
                return sb.toString();
            case 12:
                ((hmb0) obj).d1 = true;
                return rih1.a;
            case 13:
                ((qpb0) obj).getClass();
                return new bg50(blo1.c(qpb0.b));
            case 14:
                return rih1.a;
            case 15:
                List list2 = (List) obj;
                return new upb0(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 16:
                ((Integer) obj).getClass();
                return z6x.a;
            case 17:
                ((Integer) obj).getClass();
                return -1;
            case 18:
                return rih1.a;
            case 19:
                return rih1.a;
            case 20:
                ((Integer) obj).getClass();
                return null;
            case 21:
                return rih1.a;
            case 22:
                List list3 = (List) obj;
                return new fvb0((int[]) list3.get(0), (int[]) list3.get(1));
            case 23:
                return rih1.a;
            case 24:
                return rih1.a;
            case 25:
                return rih1.a;
            case 26:
                plc0 plc0Var = ((plc0) obj).p;
                if (plc0Var instanceof plc0) {
                    return plc0Var;
                }
                return null;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                plc0 plc0Var2 = (plc0) obj;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(plc0Var2.n);
                sb2.append('=');
                sb2.append(plc0Var2.o);
                return sb2.toString();
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                s5t0 s5t0Var = (s5t0) obj;
                if (s5t0Var.B0()) {
                    x5f0 x5f0Var = s5t0Var.b;
                    if (!x5f0Var.O0) {
                        iu30 iu30VarE = s5t0Var.a.e();
                        if (s5t0Var.a.d() != null) {
                            x5f0Var.L0();
                        } else if (iu30VarE == null) {
                            x5f0Var.h = null;
                            x5f0Var.i = null;
                            x5f0Var.g = null;
                            x5f0Var.L0();
                        } else {
                            x5f0Var.h = null;
                            x5f0Var.i = null;
                            x5f0Var.r0(s5t0Var, 9223372034707292159L, 0L);
                            x5f0Var.g = iu30VarE;
                        }
                    }
                }
                return rih1.a;
            default:
                s5t0 s5t0Var2 = (s5t0) obj;
                if (s5t0Var2.B0() && (zy31Var = s5t0Var2.c) != null) {
                    x5f0 x5f0Var2 = s5t0Var2.b;
                    nen0 nen0Var = x5f0Var2.R0;
                    oen0 oen0Var = nen0Var != null ? (oen0) nen0Var.g(zy31Var) : null;
                    if (oen0Var != null) {
                        v170 v170Var = x5f0Var2.Q0;
                        if (v170Var != null) {
                            v170Var.a(zy31Var);
                        }
                        x5f0Var2.J0(oen0Var);
                        oen0Var.b();
                    }
                }
                return rih1.a;
        }
    }

    public /* synthetic */ pv40(byte b) {
        this.a = b;
    }

    public /* synthetic */ pv40(p811 p811Var) {
        this.a = (byte) 1;
    }
}
