package p;

import androidx.car.app.navigation.model.Maneuver;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class jfa implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ jfa(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0123  */
    public final Object invoke(Object obj) throws Exception {
        boolean z;
        boolean z2;
        Long lValueOf;
        vwl1 vwl1Var;
        wvl1 wvl1VarM;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        final String str = this.b;
        switch (b) {
            case 0:
                e261 e261Var = (e261) obj;
                b261.t(e261Var, 1);
                b261.u(e261Var, str);
                return rih1Var;
            case 1:
                b261.n((e261) obj, str);
                return rih1Var;
            case 2:
                b261.u((e261) obj, str);
                return rih1Var;
            case 3:
                d441 d441VarG1 = ((y341) obj).g1("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                try {
                    d441VarG1.K(1, str);
                    if (d441VarG1.f1()) {
                        z = false;
                        if (((int) d441VarG1.getLong(0)) != 0) {
                            z2 = true;
                        }
                        d441VarG1.close();
                        return Boolean.valueOf(z2);
                    }
                    z = false;
                    z2 = z;
                    d441VarG1.close();
                    return Boolean.valueOf(z2);
                } catch (Throwable th) {
                    d441VarG1.close();
                    throw th;
                }
            case 4:
                d441 d441VarG2 = ((y341) obj).g1("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
                try {
                    d441VarG2.K(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (d441VarG2.f1()) {
                        arrayList.add(d441VarG2.P0(0));
                    }
                    d441VarG2.close();
                    return arrayList;
                } catch (Throwable th2) {
                    d441VarG2.close();
                    throw th2;
                }
            case 5:
                d441 d441VarG3 = ((y341) obj).g1("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                try {
                    d441VarG3.K(1, str);
                    return Boolean.valueOf(d441VarG3.f1() && ((int) d441VarG3.getLong(0)) != 0);
                } finally {
                    d441VarG3.close();
                }
            case 6:
                e261 e261Var2 = (e261) obj;
                b261.n(e261Var2, str);
                b261.x(e261Var2, 5);
                return rih1Var;
            case 7:
                e261 e261Var3 = (e261) obj;
                b261.n(e261Var3, str);
                b261.x(e261Var3, 5);
                return rih1Var;
            case 8:
                e261 e261Var4 = (e261) obj;
                b261.n(e261Var4, str);
                b261.x(e261Var4, 5);
                return rih1Var;
            case 9:
                e261 e261Var5 = (e261) obj;
                b261.u(e261Var5, str);
                b261.G(e261Var5, 0.0f);
                return rih1Var;
            case 10:
                d441 d441VarG4 = ((y341) obj).g1("SELECT long_value FROM Preference where `key`=?");
                try {
                    d441VarG4.K(1, str);
                    if (d441VarG4.f1() && !d441VarG4.isNull(0)) {
                        lValueOf = Long.valueOf(d441VarG4.getLong(0));
                        break;
                    } else {
                        lValueOf = null;
                    }
                    return lValueOf;
                } finally {
                    d441VarG4.close();
                }
            case 11:
                b261.n((e261) obj, str);
                return rih1Var;
            case 12:
                hhg1 hhg1Var = vwl1.z;
                final dxl1 dxl1VarA = ((WorkDatabase) obj).A();
                final byte b2 = 0;
                return (List) hhg1Var.apply((List) qyo1.x(dxl1VarA.a, true, true, new iu30() { // from class: p.axl1
                    public final Object invoke(Object obj2) throws Exception {
                        byte b3 = b2;
                        int i = 17;
                        int i2 = 16;
                        int i3 = 15;
                        int i4 = 14;
                        int i5 = 4;
                        int i6 = 3;
                        int i7 = 2;
                        int i8 = 1;
                        dxl1 dxl1Var = dxl1VarA;
                        String str2 = str;
                        switch (b3) {
                            case 0:
                                y341 y341Var = (y341) obj2;
                                d441 d441VarG5 = y341Var.g1("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                                try {
                                    d441VarG5.K(1, str2);
                                    y36 y36Var = new y36(0);
                                    y36 y36Var2 = new y36(0);
                                    while (d441VarG5.f1()) {
                                        String strP0 = d441VarG5.P0(0);
                                        if (!y36Var.containsKey(strP0)) {
                                            y36Var.put(strP0, new ArrayList());
                                        }
                                        String strP1 = d441VarG5.P0(0);
                                        if (!y36Var2.containsKey(strP1)) {
                                            y36Var2.put(strP1, new ArrayList());
                                        }
                                    }
                                    d441VarG5.reset();
                                    dxl1Var.b(y341Var, y36Var);
                                    dxl1Var.a(y341Var, y36Var2);
                                    ArrayList arrayList2 = new ArrayList();
                                    while (d441VarG5.f1()) {
                                        String strP2 = d441VarG5.P0(0);
                                        wvl1 wvl1VarM2 = cwl1.M((int) d441VarG5.getLong(1));
                                        byte[] blob = d441VarG5.getBlob(2);
                                        ewq ewqVar = ewq.b;
                                        ewq ewqVarA = o0c.A(blob);
                                        int i9 = (int) d441VarG5.getLong(3);
                                        int i10 = (int) d441VarG5.getLong(4);
                                        arrayList2.add(new uwl1(strP2, wvl1VarM2, ewqVarA, d441VarG5.getLong(14), d441VarG5.getLong(15), d441VarG5.getLong(16), new gjl(cwl1.q0(d441VarG5.getBlob(6)), cwl1.K((int) d441VarG5.getLong(5)), ((int) d441VarG5.getLong(7)) != 0, ((int) d441VarG5.getLong(8)) != 0, ((int) d441VarG5.getLong(9)) != 0, ((int) d441VarG5.getLong(10)) != 0, d441VarG5.getLong(11), d441VarG5.getLong(12), cwl1.k(d441VarG5.getBlob(13))), i9, cwl1.J((int) d441VarG5.getLong(17)), d441VarG5.getLong(18), d441VarG5.getLong(19), (int) d441VarG5.getLong(20), i10, d441VarG5.getLong(21), (int) d441VarG5.getLong(22), (List) sqg0.G(d441VarG5.P0(0), y36Var), (List) sqg0.G(d441VarG5.P0(0), y36Var2)));
                                        break;
                                    }
                                    return arrayList2;
                                } finally {
                                    d441VarG5.close();
                                }
                            case 1:
                                y341 y341Var2 = (y341) obj2;
                                d441 d441VarG6 = y341Var2.g1("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                                try {
                                    d441VarG6.K(1, str2);
                                    y36 y36Var3 = new y36(0);
                                    y36 y36Var4 = new y36(0);
                                    while (d441VarG6.f1()) {
                                        String strP3 = d441VarG6.P0(0);
                                        if (!y36Var3.containsKey(strP3)) {
                                            y36Var3.put(strP3, new ArrayList());
                                        }
                                        String strP4 = d441VarG6.P0(0);
                                        if (!y36Var4.containsKey(strP4)) {
                                            y36Var4.put(strP4, new ArrayList());
                                        }
                                    }
                                    d441VarG6.reset();
                                    dxl1Var.b(y341Var2, y36Var3);
                                    dxl1Var.a(y341Var2, y36Var4);
                                    ArrayList arrayList3 = new ArrayList();
                                    while (d441VarG6.f1()) {
                                        String strP5 = d441VarG6.P0(0);
                                        wvl1 wvl1VarM3 = cwl1.M((int) d441VarG6.getLong(i8));
                                        byte[] blob2 = d441VarG6.getBlob(2);
                                        ewq ewqVar2 = ewq.b;
                                        ewq ewqVarA2 = o0c.A(blob2);
                                        int i11 = (int) d441VarG6.getLong(3);
                                        int i12 = (int) d441VarG6.getLong(4);
                                        arrayList3.add(new uwl1(strP5, wvl1VarM3, ewqVarA2, d441VarG6.getLong(i4), d441VarG6.getLong(15), d441VarG6.getLong(16), new gjl(cwl1.q0(d441VarG6.getBlob(6)), cwl1.K((int) d441VarG6.getLong(5)), ((int) d441VarG6.getLong(7)) != 0, ((int) d441VarG6.getLong(8)) != 0, ((int) d441VarG6.getLong(9)) != 0, ((int) d441VarG6.getLong(10)) != 0, d441VarG6.getLong(11), d441VarG6.getLong(12), cwl1.k(d441VarG6.getBlob(13))), i11, cwl1.J((int) d441VarG6.getLong(17)), d441VarG6.getLong(18), d441VarG6.getLong(19), (int) d441VarG6.getLong(20), i12, d441VarG6.getLong(21), (int) d441VarG6.getLong(22), (List) sqg0.G(d441VarG6.P0(0), y36Var3), (List) sqg0.G(d441VarG6.P0(0), y36Var4)));
                                        i4 = 14;
                                        i8 = 1;
                                        break;
                                    }
                                    return arrayList3;
                                } finally {
                                    d441VarG6.close();
                                }
                            default:
                                y341 y341Var3 = (y341) obj2;
                                d441 d441VarG7 = y341Var3.g1("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)");
                                try {
                                    d441VarG7.K(1, str2);
                                    y36 y36Var5 = new y36(0);
                                    y36 y36Var6 = new y36(0);
                                    while (d441VarG7.f1()) {
                                        String strP6 = d441VarG7.P0(0);
                                        if (!y36Var5.containsKey(strP6)) {
                                            y36Var5.put(strP6, new ArrayList());
                                        }
                                        String strP7 = d441VarG7.P0(0);
                                        if (!y36Var6.containsKey(strP7)) {
                                            y36Var6.put(strP7, new ArrayList());
                                        }
                                    }
                                    d441VarG7.reset();
                                    dxl1Var.b(y341Var3, y36Var5);
                                    dxl1Var.a(y341Var3, y36Var6);
                                    ArrayList arrayList4 = new ArrayList();
                                    while (d441VarG7.f1()) {
                                        String strP8 = d441VarG7.P0(0);
                                        wvl1 wvl1VarM4 = cwl1.M((int) d441VarG7.getLong(1));
                                        byte[] blob3 = d441VarG7.getBlob(i7);
                                        ewq ewqVar3 = ewq.b;
                                        ewq ewqVarA3 = o0c.A(blob3);
                                        int i13 = (int) d441VarG7.getLong(i6);
                                        int i14 = (int) d441VarG7.getLong(i5);
                                        arrayList4.add(new uwl1(strP8, wvl1VarM4, ewqVarA3, d441VarG7.getLong(14), d441VarG7.getLong(i3), d441VarG7.getLong(i2), new gjl(cwl1.q0(d441VarG7.getBlob(6)), cwl1.K((int) d441VarG7.getLong(5)), ((int) d441VarG7.getLong(7)) != 0, ((int) d441VarG7.getLong(8)) != 0, ((int) d441VarG7.getLong(9)) != 0, ((int) d441VarG7.getLong(10)) != 0, d441VarG7.getLong(11), d441VarG7.getLong(12), cwl1.k(d441VarG7.getBlob(13))), i13, cwl1.J((int) d441VarG7.getLong(i)), d441VarG7.getLong(18), d441VarG7.getLong(19), (int) d441VarG7.getLong(20), i14, d441VarG7.getLong(21), (int) d441VarG7.getLong(22), (List) sqg0.G(d441VarG7.P0(0), y36Var5), (List) sqg0.G(d441VarG7.P0(0), y36Var6)));
                                        i = 17;
                                        i2 = 16;
                                        i3 = 15;
                                        i5 = 4;
                                        i6 = 3;
                                        i7 = 2;
                                        break;
                                    }
                                    return arrayList4;
                                } finally {
                                    d441VarG7.close();
                                }
                        }
                    }
                }));
            case 13:
                hhg1 hhg1Var2 = vwl1.z;
                final dxl1 dxl1VarA2 = ((WorkDatabase) obj).A();
                final byte b3 = 2;
                return (List) hhg1Var2.apply((List) qyo1.x(dxl1VarA2.a, true, true, new iu30() { // from class: p.axl1
                    public final Object invoke(Object obj2) throws Exception {
                        byte b4 = b3;
                        int i = 17;
                        int i2 = 16;
                        int i3 = 15;
                        int i4 = 14;
                        int i5 = 4;
                        int i6 = 3;
                        int i7 = 2;
                        int i8 = 1;
                        dxl1 dxl1Var = dxl1VarA2;
                        String str2 = str;
                        switch (b4) {
                            case 0:
                                y341 y341Var = (y341) obj2;
                                d441 d441VarG5 = y341Var.g1("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                                try {
                                    d441VarG5.K(1, str2);
                                    y36 y36Var = new y36(0);
                                    y36 y36Var2 = new y36(0);
                                    while (d441VarG5.f1()) {
                                        String strP0 = d441VarG5.P0(0);
                                        if (!y36Var.containsKey(strP0)) {
                                            y36Var.put(strP0, new ArrayList());
                                        }
                                        String strP1 = d441VarG5.P0(0);
                                        if (!y36Var2.containsKey(strP1)) {
                                            y36Var2.put(strP1, new ArrayList());
                                        }
                                    }
                                    d441VarG5.reset();
                                    dxl1Var.b(y341Var, y36Var);
                                    dxl1Var.a(y341Var, y36Var2);
                                    ArrayList arrayList2 = new ArrayList();
                                    while (d441VarG5.f1()) {
                                        String strP2 = d441VarG5.P0(0);
                                        wvl1 wvl1VarM2 = cwl1.M((int) d441VarG5.getLong(1));
                                        byte[] blob = d441VarG5.getBlob(2);
                                        ewq ewqVar = ewq.b;
                                        ewq ewqVarA = o0c.A(blob);
                                        int i9 = (int) d441VarG5.getLong(3);
                                        int i10 = (int) d441VarG5.getLong(4);
                                        arrayList2.add(new uwl1(strP2, wvl1VarM2, ewqVarA, d441VarG5.getLong(14), d441VarG5.getLong(15), d441VarG5.getLong(16), new gjl(cwl1.q0(d441VarG5.getBlob(6)), cwl1.K((int) d441VarG5.getLong(5)), ((int) d441VarG5.getLong(7)) != 0, ((int) d441VarG5.getLong(8)) != 0, ((int) d441VarG5.getLong(9)) != 0, ((int) d441VarG5.getLong(10)) != 0, d441VarG5.getLong(11), d441VarG5.getLong(12), cwl1.k(d441VarG5.getBlob(13))), i9, cwl1.J((int) d441VarG5.getLong(17)), d441VarG5.getLong(18), d441VarG5.getLong(19), (int) d441VarG5.getLong(20), i10, d441VarG5.getLong(21), (int) d441VarG5.getLong(22), (List) sqg0.G(d441VarG5.P0(0), y36Var), (List) sqg0.G(d441VarG5.P0(0), y36Var2)));
                                        break;
                                    }
                                    return arrayList2;
                                } finally {
                                    d441VarG5.close();
                                }
                            case 1:
                                y341 y341Var2 = (y341) obj2;
                                d441 d441VarG6 = y341Var2.g1("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                                try {
                                    d441VarG6.K(1, str2);
                                    y36 y36Var3 = new y36(0);
                                    y36 y36Var4 = new y36(0);
                                    while (d441VarG6.f1()) {
                                        String strP3 = d441VarG6.P0(0);
                                        if (!y36Var3.containsKey(strP3)) {
                                            y36Var3.put(strP3, new ArrayList());
                                        }
                                        String strP4 = d441VarG6.P0(0);
                                        if (!y36Var4.containsKey(strP4)) {
                                            y36Var4.put(strP4, new ArrayList());
                                        }
                                    }
                                    d441VarG6.reset();
                                    dxl1Var.b(y341Var2, y36Var3);
                                    dxl1Var.a(y341Var2, y36Var4);
                                    ArrayList arrayList3 = new ArrayList();
                                    while (d441VarG6.f1()) {
                                        String strP5 = d441VarG6.P0(0);
                                        wvl1 wvl1VarM3 = cwl1.M((int) d441VarG6.getLong(i8));
                                        byte[] blob2 = d441VarG6.getBlob(2);
                                        ewq ewqVar2 = ewq.b;
                                        ewq ewqVarA2 = o0c.A(blob2);
                                        int i11 = (int) d441VarG6.getLong(3);
                                        int i12 = (int) d441VarG6.getLong(4);
                                        arrayList3.add(new uwl1(strP5, wvl1VarM3, ewqVarA2, d441VarG6.getLong(i4), d441VarG6.getLong(15), d441VarG6.getLong(16), new gjl(cwl1.q0(d441VarG6.getBlob(6)), cwl1.K((int) d441VarG6.getLong(5)), ((int) d441VarG6.getLong(7)) != 0, ((int) d441VarG6.getLong(8)) != 0, ((int) d441VarG6.getLong(9)) != 0, ((int) d441VarG6.getLong(10)) != 0, d441VarG6.getLong(11), d441VarG6.getLong(12), cwl1.k(d441VarG6.getBlob(13))), i11, cwl1.J((int) d441VarG6.getLong(17)), d441VarG6.getLong(18), d441VarG6.getLong(19), (int) d441VarG6.getLong(20), i12, d441VarG6.getLong(21), (int) d441VarG6.getLong(22), (List) sqg0.G(d441VarG6.P0(0), y36Var3), (List) sqg0.G(d441VarG6.P0(0), y36Var4)));
                                        i4 = 14;
                                        i8 = 1;
                                        break;
                                    }
                                    return arrayList3;
                                } finally {
                                    d441VarG6.close();
                                }
                            default:
                                y341 y341Var3 = (y341) obj2;
                                d441 d441VarG7 = y341Var3.g1("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)");
                                try {
                                    d441VarG7.K(1, str2);
                                    y36 y36Var5 = new y36(0);
                                    y36 y36Var6 = new y36(0);
                                    while (d441VarG7.f1()) {
                                        String strP6 = d441VarG7.P0(0);
                                        if (!y36Var5.containsKey(strP6)) {
                                            y36Var5.put(strP6, new ArrayList());
                                        }
                                        String strP7 = d441VarG7.P0(0);
                                        if (!y36Var6.containsKey(strP7)) {
                                            y36Var6.put(strP7, new ArrayList());
                                        }
                                    }
                                    d441VarG7.reset();
                                    dxl1Var.b(y341Var3, y36Var5);
                                    dxl1Var.a(y341Var3, y36Var6);
                                    ArrayList arrayList4 = new ArrayList();
                                    while (d441VarG7.f1()) {
                                        String strP8 = d441VarG7.P0(0);
                                        wvl1 wvl1VarM4 = cwl1.M((int) d441VarG7.getLong(1));
                                        byte[] blob3 = d441VarG7.getBlob(i7);
                                        ewq ewqVar3 = ewq.b;
                                        ewq ewqVarA3 = o0c.A(blob3);
                                        int i13 = (int) d441VarG7.getLong(i6);
                                        int i14 = (int) d441VarG7.getLong(i5);
                                        arrayList4.add(new uwl1(strP8, wvl1VarM4, ewqVarA3, d441VarG7.getLong(14), d441VarG7.getLong(i3), d441VarG7.getLong(i2), new gjl(cwl1.q0(d441VarG7.getBlob(6)), cwl1.K((int) d441VarG7.getLong(5)), ((int) d441VarG7.getLong(7)) != 0, ((int) d441VarG7.getLong(8)) != 0, ((int) d441VarG7.getLong(9)) != 0, ((int) d441VarG7.getLong(10)) != 0, d441VarG7.getLong(11), d441VarG7.getLong(12), cwl1.k(d441VarG7.getBlob(13))), i13, cwl1.J((int) d441VarG7.getLong(i)), d441VarG7.getLong(18), d441VarG7.getLong(19), (int) d441VarG7.getLong(20), i14, d441VarG7.getLong(21), (int) d441VarG7.getLong(22), (List) sqg0.G(d441VarG7.P0(0), y36Var5), (List) sqg0.G(d441VarG7.P0(0), y36Var6)));
                                        i = 17;
                                        i2 = 16;
                                        i3 = 15;
                                        i5 = 4;
                                        i6 = 3;
                                        i7 = 2;
                                        break;
                                    }
                                    return arrayList4;
                                } finally {
                                    d441VarG7.close();
                                }
                        }
                    }
                }));
            case 14:
                String str2 = (String) obj;
                if (ihc1.y0(str2)) {
                    return str2.length() < str.length() ? str : str2;
                }
                return str.concat(str2);
            case 15:
                d441 d441VarG5 = ((y341) obj).g1("DELETE FROM SystemIdInfo where work_spec_id=?");
                try {
                    d441VarG5.K(1, str);
                    d441VarG5.f1();
                    return rih1Var;
                } finally {
                    d441VarG5.close();
                }
            case 16:
                mma0[] mma0VarArr = b261.a;
                ((e261) obj).b(z161.O, str);
                return rih1Var;
            case 17:
                d441 d441VarG6 = ((y341) obj).g1("SELECT name FROM workname WHERE work_spec_id=?");
                try {
                    d441VarG6.K(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (d441VarG6.f1()) {
                        arrayList2.add(d441VarG6.P0(0));
                    }
                    d441VarG6.close();
                    return arrayList2;
                } catch (Throwable th3) {
                    d441VarG6.close();
                    throw th3;
                }
            case 18:
                d441 d441VarG7 = ((y341) obj).g1("DELETE from WorkProgress where work_spec_id=?");
                try {
                    d441VarG7.K(1, str);
                    d441VarG7.f1();
                    return rih1Var;
                } finally {
                    d441VarG7.close();
                }
            case 19:
                d441 d441VarG8 = ((y341) obj).g1("SELECT * FROM workspec WHERE id=?");
                try {
                    d441VarG8.K(1, str);
                    int iW = y7y0.w(d441VarG8, "id");
                    int iW2 = y7y0.w(d441VarG8, "state");
                    int iW3 = y7y0.w(d441VarG8, "worker_class_name");
                    int iW4 = y7y0.w(d441VarG8, "input_merger_class_name");
                    int iW5 = y7y0.w(d441VarG8, "input");
                    int iW6 = y7y0.w(d441VarG8, "output");
                    int iW7 = y7y0.w(d441VarG8, "initial_delay");
                    int iW8 = y7y0.w(d441VarG8, "interval_duration");
                    int iW9 = y7y0.w(d441VarG8, "flex_duration");
                    int iW10 = y7y0.w(d441VarG8, "run_attempt_count");
                    int iW11 = y7y0.w(d441VarG8, "backoff_policy");
                    int iW12 = y7y0.w(d441VarG8, "backoff_delay_duration");
                    int iW13 = y7y0.w(d441VarG8, "last_enqueue_time");
                    int iW14 = y7y0.w(d441VarG8, "minimum_retention_duration");
                    int iW15 = y7y0.w(d441VarG8, "schedule_requested_at");
                    int iW16 = y7y0.w(d441VarG8, "run_in_foreground");
                    int iW17 = y7y0.w(d441VarG8, "out_of_quota_policy");
                    int iW18 = y7y0.w(d441VarG8, "period_count");
                    int iW19 = y7y0.w(d441VarG8, "generation");
                    int iW20 = y7y0.w(d441VarG8, "next_schedule_time_override");
                    int iW21 = y7y0.w(d441VarG8, "next_schedule_time_override_generation");
                    int iW22 = y7y0.w(d441VarG8, "stop_reason");
                    int iW23 = y7y0.w(d441VarG8, "trace_tag");
                    int iW24 = y7y0.w(d441VarG8, "backoff_on_system_interruptions");
                    int iW25 = y7y0.w(d441VarG8, "required_network_type");
                    int iW26 = y7y0.w(d441VarG8, "required_network_request");
                    int iW27 = y7y0.w(d441VarG8, "requires_charging");
                    int iW28 = y7y0.w(d441VarG8, "requires_device_idle");
                    int iW29 = y7y0.w(d441VarG8, "requires_battery_not_low");
                    int iW30 = y7y0.w(d441VarG8, "requires_storage_not_low");
                    int iW31 = y7y0.w(d441VarG8, "trigger_content_update_delay");
                    int iW32 = y7y0.w(d441VarG8, "trigger_max_content_delay");
                    int iW33 = y7y0.w(d441VarG8, "content_uri_triggers");
                    if (d441VarG8.f1()) {
                        String strP0 = d441VarG8.P0(iW);
                        wvl1 wvl1VarM2 = cwl1.M((int) d441VarG8.getLong(iW2));
                        String strP1 = d441VarG8.P0(iW3);
                        String strP2 = d441VarG8.P0(iW4);
                        byte[] blob = d441VarG8.getBlob(iW5);
                        ewq ewqVar = ewq.b;
                        ewq ewqVarA = o0c.A(blob);
                        ewq ewqVarA2 = o0c.A(d441VarG8.getBlob(iW6));
                        long j = d441VarG8.getLong(iW7);
                        long j2 = d441VarG8.getLong(iW8);
                        long j3 = d441VarG8.getLong(iW9);
                        int i = (int) d441VarG8.getLong(iW10);
                        h0a h0aVarJ = cwl1.J((int) d441VarG8.getLong(iW11));
                        long j4 = d441VarG8.getLong(iW12);
                        long j5 = d441VarG8.getLong(iW13);
                        long j6 = d441VarG8.getLong(iW14);
                        long j7 = d441VarG8.getLong(iW15);
                        boolean z3 = ((int) d441VarG8.getLong(iW16)) != 0;
                        int iL = cwl1.L((int) d441VarG8.getLong(iW17));
                        int i2 = (int) d441VarG8.getLong(iW18);
                        int i3 = (int) d441VarG8.getLong(iW19);
                        long j8 = d441VarG8.getLong(iW20);
                        int i4 = (int) d441VarG8.getLong(iW21);
                        int i5 = (int) d441VarG8.getLong(iW22);
                        String strP3 = d441VarG8.isNull(iW23) ? null : d441VarG8.P0(iW23);
                        Integer numValueOf = d441VarG8.isNull(iW24) ? null : Integer.valueOf((int) d441VarG8.getLong(iW24));
                        vwl1Var = new vwl1(strP0, wvl1VarM2, strP1, strP2, ewqVarA, ewqVarA2, j, j2, j3, new gjl(cwl1.q0(d441VarG8.getBlob(iW26)), cwl1.K((int) d441VarG8.getLong(iW25)), ((int) d441VarG8.getLong(iW27)) != 0, ((int) d441VarG8.getLong(iW28)) != 0, ((int) d441VarG8.getLong(iW29)) != 0, ((int) d441VarG8.getLong(iW30)) != 0, d441VarG8.getLong(iW31), d441VarG8.getLong(iW32), cwl1.k(d441VarG8.getBlob(iW33))), i, h0aVarJ, j4, j5, j6, j7, z3, iL, i2, i3, j8, i4, i5, strP3, numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null);
                    } else {
                        vwl1Var = null;
                    }
                    return vwl1Var;
                } finally {
                    d441VarG8.close();
                }
            case 20:
                d441 d441VarG9 = ((y341) obj).g1("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    d441VarG9.K(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (d441VarG9.f1()) {
                        String strP4 = d441VarG9.P0(0);
                        wvl1 wvl1VarM3 = cwl1.M((int) d441VarG9.getLong(1));
                        twl1 twl1Var = new twl1();
                        twl1Var.a = strP4;
                        twl1Var.b = wvl1VarM3;
                        arrayList3.add(twl1Var);
                    }
                    d441VarG9.close();
                    return arrayList3;
                } catch (Throwable th4) {
                    d441VarG9.close();
                    throw th4;
                }
            case 21:
                d441 d441VarG10 = ((y341) obj).g1("SELECT state FROM workspec WHERE id=?");
                try {
                    d441VarG10.K(1, str);
                    if (d441VarG10.f1()) {
                        Integer numValueOf2 = d441VarG10.isNull(0) ? null : Integer.valueOf((int) d441VarG10.getLong(0));
                        if (numValueOf2 != null) {
                            wvl1VarM = cwl1.M(numValueOf2.intValue());
                        } else {
                            wvl1VarM = null;
                        }
                        break;
                    } else {
                        wvl1VarM = null;
                    }
                    return wvl1VarM;
                } finally {
                    d441VarG10.close();
                }
            case 22:
                d441 d441VarG11 = ((y341) obj).g1("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    d441VarG11.K(1, str);
                    ArrayList arrayList4 = new ArrayList();
                    while (d441VarG11.f1()) {
                        arrayList4.add(d441VarG11.P0(0));
                    }
                    d441VarG11.close();
                    return arrayList4;
                } catch (Throwable th5) {
                    d441VarG11.close();
                    throw th5;
                }
            case 23:
                y341 y341Var = (y341) obj;
                d441 d441VarG12 = y341Var.g1("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?");
                try {
                    d441VarG12.K(1, str);
                    d441VarG12.f1();
                    return Integer.valueOf(jhc1.x(y341Var));
                } finally {
                    d441VarG12.close();
                }
            case 24:
                y341 y341Var2 = (y341) obj;
                d441 d441VarG13 = y341Var2.g1("UPDATE workspec SET run_attempt_count=0 WHERE id=?");
                try {
                    d441VarG13.K(1, str);
                    d441VarG13.f1();
                    return Integer.valueOf(jhc1.x(y341Var2));
                } finally {
                    d441VarG13.close();
                }
            case 25:
                d441 d441VarG14 = ((y341) obj).g1("UPDATE workspec SET period_count=period_count+1 WHERE id=?");
                try {
                    d441VarG14.K(1, str);
                    d441VarG14.f1();
                    return rih1Var;
                } finally {
                    d441VarG14.close();
                }
            case 26:
                d441 d441VarG15 = ((y341) obj).g1("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                try {
                    d441VarG15.K(1, str);
                    ArrayList arrayList5 = new ArrayList();
                    while (d441VarG15.f1()) {
                        byte[] blob2 = d441VarG15.getBlob(0);
                        ewq ewqVar2 = ewq.b;
                        arrayList5.add(o0c.A(blob2));
                    }
                    d441VarG15.close();
                    return arrayList5;
                } catch (Throwable th6) {
                    d441VarG15.close();
                    throw th6;
                }
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                y341 y341Var3 = (y341) obj;
                d441 d441VarG16 = y341Var3.g1("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                try {
                    d441VarG16.K(1, str);
                    d441VarG16.f1();
                    return Integer.valueOf(jhc1.x(y341Var3));
                } finally {
                    d441VarG16.close();
                }
            default:
                d441 d441VarG17 = ((y341) obj).g1("DELETE FROM workspec WHERE id=?");
                try {
                    d441VarG17.K(1, str);
                    d441VarG17.f1();
                    return rih1Var;
                } finally {
                    d441VarG17.close();
                }
        }
    }
}
