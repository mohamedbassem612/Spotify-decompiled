package p;

import androidx.car.app.navigation.model.Maneuver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class qti1 implements iu30 {
    public final /* synthetic */ byte a;

    private final Object a(Object obj) throws Exception {
        d441 d441VarG1 = ((y341) obj).g1("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        try {
            int iW = y7y0.w(d441VarG1, "id");
            int iW2 = y7y0.w(d441VarG1, "state");
            int iW3 = y7y0.w(d441VarG1, "worker_class_name");
            int iW4 = y7y0.w(d441VarG1, "input_merger_class_name");
            int iW5 = y7y0.w(d441VarG1, "input");
            int iW6 = y7y0.w(d441VarG1, "output");
            int iW7 = y7y0.w(d441VarG1, "initial_delay");
            int iW8 = y7y0.w(d441VarG1, "interval_duration");
            int iW9 = y7y0.w(d441VarG1, "flex_duration");
            int iW10 = y7y0.w(d441VarG1, "run_attempt_count");
            int iW11 = y7y0.w(d441VarG1, "backoff_policy");
            int iW12 = y7y0.w(d441VarG1, "backoff_delay_duration");
            int iW13 = y7y0.w(d441VarG1, "last_enqueue_time");
            int iW14 = y7y0.w(d441VarG1, "minimum_retention_duration");
            int iW15 = y7y0.w(d441VarG1, "schedule_requested_at");
            int iW16 = y7y0.w(d441VarG1, "run_in_foreground");
            int iW17 = y7y0.w(d441VarG1, "out_of_quota_policy");
            int iW18 = y7y0.w(d441VarG1, "period_count");
            int iW19 = y7y0.w(d441VarG1, "generation");
            int iW20 = y7y0.w(d441VarG1, "next_schedule_time_override");
            int iW21 = y7y0.w(d441VarG1, "next_schedule_time_override_generation");
            int iW22 = y7y0.w(d441VarG1, "stop_reason");
            int iW23 = y7y0.w(d441VarG1, "trace_tag");
            int iW24 = y7y0.w(d441VarG1, "backoff_on_system_interruptions");
            int iW25 = y7y0.w(d441VarG1, "required_network_type");
            int iW26 = y7y0.w(d441VarG1, "required_network_request");
            int iW27 = y7y0.w(d441VarG1, "requires_charging");
            int iW28 = y7y0.w(d441VarG1, "requires_device_idle");
            int iW29 = y7y0.w(d441VarG1, "requires_battery_not_low");
            int iW30 = y7y0.w(d441VarG1, "requires_storage_not_low");
            int iW31 = y7y0.w(d441VarG1, "trigger_content_update_delay");
            int iW32 = y7y0.w(d441VarG1, "trigger_max_content_delay");
            int iW33 = y7y0.w(d441VarG1, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (d441VarG1.f1()) {
                String strP0 = d441VarG1.P0(iW);
                int i = iW14;
                ArrayList arrayList2 = arrayList;
                wvl1 wvl1VarM = cwl1.M((int) d441VarG1.getLong(iW2));
                String strP1 = d441VarG1.P0(iW3);
                String strP2 = d441VarG1.P0(iW4);
                byte[] blob = d441VarG1.getBlob(iW5);
                ewq ewqVar = ewq.b;
                ewq ewqVarA = o0c.A(blob);
                ewq ewqVarA2 = o0c.A(d441VarG1.getBlob(iW6));
                long j = d441VarG1.getLong(iW7);
                long j2 = d441VarG1.getLong(iW8);
                long j3 = d441VarG1.getLong(iW9);
                int i2 = (int) d441VarG1.getLong(iW10);
                int i3 = iW2;
                int i4 = iW3;
                h0a h0aVarJ = cwl1.J((int) d441VarG1.getLong(iW11));
                long j4 = d441VarG1.getLong(iW12);
                long j5 = d441VarG1.getLong(iW13);
                long j6 = d441VarG1.getLong(i);
                int i5 = iW15;
                long j7 = d441VarG1.getLong(i5);
                int i6 = iW;
                int i7 = iW16;
                boolean z = ((int) d441VarG1.getLong(i7)) != 0;
                int i8 = iW17;
                int i9 = iW4;
                int iL = cwl1.L((int) d441VarG1.getLong(i8));
                int i10 = iW18;
                int i11 = iW5;
                int i12 = (int) d441VarG1.getLong(i10);
                int i13 = iW19;
                int i14 = (int) d441VarG1.getLong(i13);
                int i15 = iW20;
                long j8 = d441VarG1.getLong(i15);
                int i16 = iW21;
                int i17 = (int) d441VarG1.getLong(i16);
                int i18 = iW22;
                int i19 = (int) d441VarG1.getLong(i18);
                int i20 = iW23;
                Boolean boolValueOf = null;
                String strP3 = d441VarG1.isNull(i20) ? null : d441VarG1.P0(i20);
                int i21 = iW24;
                Integer numValueOf = d441VarG1.isNull(i21) ? null : Integer.valueOf((int) d441VarG1.getLong(i21));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i22 = iW25;
                Boolean bool = boolValueOf;
                int iK = cwl1.K((int) d441VarG1.getLong(i22));
                int i23 = iW26;
                e8o0 e8o0VarQ0 = cwl1.q0(d441VarG1.getBlob(i23));
                iW25 = i22;
                iW26 = i23;
                int i24 = iW27;
                boolean z2 = ((int) d441VarG1.getLong(i24)) != 0;
                iW27 = i24;
                int i25 = iW28;
                boolean z3 = ((int) d441VarG1.getLong(i25)) != 0;
                int i26 = iW29;
                boolean z4 = ((int) d441VarG1.getLong(i26)) != 0;
                iW29 = i26;
                int i27 = iW30;
                int i28 = iW31;
                int i29 = iW32;
                int i30 = iW33;
                iW33 = i30;
                arrayList2.add(new vwl1(strP0, wvl1VarM, strP1, strP2, ewqVarA, ewqVarA2, j, j2, j3, new gjl(e8o0VarQ0, iK, z2, z3, z4, ((int) d441VarG1.getLong(i27)) != 0, d441VarG1.getLong(i28), d441VarG1.getLong(i29), cwl1.k(d441VarG1.getBlob(i30))), i2, h0aVarJ, j4, j5, j6, j7, z, iL, i12, i14, j8, i17, i19, strP3, bool));
                iW30 = i27;
                iW4 = i9;
                iW17 = i8;
                iW19 = i13;
                iW22 = i18;
                iW24 = i21;
                iW31 = i28;
                iW32 = i29;
                iW2 = i3;
                iW14 = i;
                iW3 = i4;
                arrayList = arrayList2;
                iW = i6;
                iW15 = i5;
                iW16 = i7;
                iW20 = i15;
                iW21 = i16;
                iW23 = i20;
                iW28 = i25;
                iW5 = i11;
                iW18 = i10;
            }
            return arrayList;
        } finally {
            d441VarG1.close();
        }
    }

    private final Object d(Object obj) throws Exception {
        d441 d441VarG1 = ((y341) obj).g1("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
        try {
            return Integer.valueOf(d441VarG1.f1() ? (int) d441VarG1.getLong(0) : 0);
        } finally {
            d441VarG1.close();
        }
    }

    private final Object e(Object obj) throws Exception {
        d441 d441VarG1 = ((y341) obj).g1("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
        try {
            boolean z = false;
            if (d441VarG1.f1() && ((int) d441VarG1.getLong(0)) != 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        } finally {
            d441VarG1.close();
        }
    }

    private final Object f(Object obj) throws Exception {
        d441 d441VarG1 = ((y341) obj).g1("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        try {
            d441VarG1.r(1, 200L);
            int iW = y7y0.w(d441VarG1, "id");
            int iW2 = y7y0.w(d441VarG1, "state");
            int iW3 = y7y0.w(d441VarG1, "worker_class_name");
            int iW4 = y7y0.w(d441VarG1, "input_merger_class_name");
            int iW5 = y7y0.w(d441VarG1, "input");
            int iW6 = y7y0.w(d441VarG1, "output");
            int iW7 = y7y0.w(d441VarG1, "initial_delay");
            int iW8 = y7y0.w(d441VarG1, "interval_duration");
            int iW9 = y7y0.w(d441VarG1, "flex_duration");
            int iW10 = y7y0.w(d441VarG1, "run_attempt_count");
            int iW11 = y7y0.w(d441VarG1, "backoff_policy");
            int iW12 = y7y0.w(d441VarG1, "backoff_delay_duration");
            int iW13 = y7y0.w(d441VarG1, "last_enqueue_time");
            int iW14 = y7y0.w(d441VarG1, "minimum_retention_duration");
            int iW15 = y7y0.w(d441VarG1, "schedule_requested_at");
            int iW16 = y7y0.w(d441VarG1, "run_in_foreground");
            int iW17 = y7y0.w(d441VarG1, "out_of_quota_policy");
            int iW18 = y7y0.w(d441VarG1, "period_count");
            int iW19 = y7y0.w(d441VarG1, "generation");
            int iW20 = y7y0.w(d441VarG1, "next_schedule_time_override");
            int iW21 = y7y0.w(d441VarG1, "next_schedule_time_override_generation");
            int iW22 = y7y0.w(d441VarG1, "stop_reason");
            int iW23 = y7y0.w(d441VarG1, "trace_tag");
            int iW24 = y7y0.w(d441VarG1, "backoff_on_system_interruptions");
            int iW25 = y7y0.w(d441VarG1, "required_network_type");
            int iW26 = y7y0.w(d441VarG1, "required_network_request");
            int iW27 = y7y0.w(d441VarG1, "requires_charging");
            int iW28 = y7y0.w(d441VarG1, "requires_device_idle");
            int iW29 = y7y0.w(d441VarG1, "requires_battery_not_low");
            int iW30 = y7y0.w(d441VarG1, "requires_storage_not_low");
            int iW31 = y7y0.w(d441VarG1, "trigger_content_update_delay");
            int iW32 = y7y0.w(d441VarG1, "trigger_max_content_delay");
            int iW33 = y7y0.w(d441VarG1, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (d441VarG1.f1()) {
                String strP0 = d441VarG1.P0(iW);
                int i = iW13;
                int i2 = iW14;
                wvl1 wvl1VarM = cwl1.M((int) d441VarG1.getLong(iW2));
                String strP1 = d441VarG1.P0(iW3);
                String strP2 = d441VarG1.P0(iW4);
                byte[] blob = d441VarG1.getBlob(iW5);
                ewq ewqVar = ewq.b;
                ewq ewqVarA = o0c.A(blob);
                ewq ewqVarA2 = o0c.A(d441VarG1.getBlob(iW6));
                long j = d441VarG1.getLong(iW7);
                long j2 = d441VarG1.getLong(iW8);
                long j3 = d441VarG1.getLong(iW9);
                int i3 = (int) d441VarG1.getLong(iW10);
                int i4 = iW;
                int i5 = iW2;
                h0a h0aVarJ = cwl1.J((int) d441VarG1.getLong(iW11));
                long j4 = d441VarG1.getLong(iW12);
                long j5 = d441VarG1.getLong(i);
                long j6 = d441VarG1.getLong(i2);
                int i6 = iW15;
                long j7 = d441VarG1.getLong(i6);
                iW15 = i6;
                int i7 = iW16;
                int i8 = iW3;
                boolean z = ((int) d441VarG1.getLong(i7)) != 0;
                int i9 = iW17;
                int i10 = iW4;
                int iL = cwl1.L((int) d441VarG1.getLong(i9));
                int i11 = iW18;
                int i12 = (int) d441VarG1.getLong(i11);
                int i13 = iW19;
                int i14 = (int) d441VarG1.getLong(i13);
                int i15 = iW20;
                long j8 = d441VarG1.getLong(i15);
                int i16 = iW21;
                int i17 = (int) d441VarG1.getLong(i16);
                iW21 = i16;
                iW22 = iW22;
                int i18 = (int) d441VarG1.getLong(iW22);
                int i19 = iW23;
                Boolean boolValueOf = null;
                String strP3 = d441VarG1.isNull(i19) ? null : d441VarG1.P0(i19);
                int i20 = iW24;
                Integer numValueOf = d441VarG1.isNull(i20) ? null : Integer.valueOf((int) d441VarG1.getLong(i20));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i21 = iW25;
                int iK = cwl1.K((int) d441VarG1.getLong(i21));
                int i22 = iW26;
                e8o0 e8o0VarQ0 = cwl1.q0(d441VarG1.getBlob(i22));
                int i23 = iW27;
                boolean z2 = ((int) d441VarG1.getLong(i23)) != 0;
                int i24 = iW28;
                boolean z3 = ((int) d441VarG1.getLong(i24)) != 0;
                int i25 = iW29;
                boolean z4 = ((int) d441VarG1.getLong(i25)) != 0;
                iW29 = i25;
                int i26 = iW30;
                int i27 = iW31;
                int i28 = iW32;
                iW31 = i27;
                int i29 = iW33;
                arrayList.add(new vwl1(strP0, wvl1VarM, strP1, strP2, ewqVarA, ewqVarA2, j, j2, j3, new gjl(e8o0VarQ0, iK, z2, z3, z4, ((int) d441VarG1.getLong(i26)) != 0, d441VarG1.getLong(i27), d441VarG1.getLong(i28), cwl1.k(d441VarG1.getBlob(i29))), i3, h0aVarJ, j4, j5, j6, j7, z, iL, i12, i14, j8, i17, i18, strP3, bool));
                iW28 = i24;
                iW4 = i10;
                iW17 = i9;
                iW18 = i11;
                iW19 = i13;
                iW20 = i15;
                iW23 = i19;
                iW24 = i20;
                iW25 = i21;
                iW26 = i22;
                iW27 = i23;
                iW33 = i29;
                iW32 = i28;
                iW30 = i26;
                iW = i4;
                iW3 = i8;
                iW13 = i;
                iW14 = i2;
                iW2 = i5;
                iW16 = i7;
            }
            return arrayList;
        } finally {
            d441VarG1.close();
        }
    }

    public final Object invoke(Object obj) throws Exception {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        switch (this.a) {
            case 0:
                Size size = (Size) obj;
                return new le5(Float.intBitsToFloat((int) (size.a >> 32)), Float.intBitsToFloat((int) (size.a & 4294967295L)));
            case 1:
                le5 le5Var = (le5) obj;
                return new Size((((long) Float.floatToRawIntBits(le5Var.a)) << 32) | (((long) Float.floatToRawIntBits(le5Var.b)) & 4294967295L));
            case 2:
                Offset offset = (Offset) obj;
                return new le5(Float.intBitsToFloat((int) (offset.a >> 32)), Float.intBitsToFloat((int) (offset.a & 4294967295L)));
            case 3:
                le5 le5Var2 = (le5) obj;
                return new Offset((((long) Float.floatToRawIntBits(le5Var2.a)) << 32) | (((long) Float.floatToRawIntBits(le5Var2.b)) & 4294967295L));
            case 4:
                long j = ((qr80) obj).a;
                return new le5((int) (j >> 32), (int) (j & 4294967295L));
            case 5:
                le5 le5Var3 = (le5) obj;
                return new qr80((((long) Math.round(le5Var3.a)) << 32) | (((long) Math.round(le5Var3.b)) & 4294967295L));
            case 6:
                long j2 = ((yr80) obj).a;
                return new le5((int) (j2 >> 32), (int) (j2 & 4294967295L));
            case 7:
                le5 le5Var4 = (le5) obj;
                int iRound = Math.round(le5Var4.a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(le5Var4.b);
                return new yr80((((long) iRound) << 32) | (((long) (iRound2 < 0 ? 0 : iRound2)) & 4294967295L));
            case 8:
                n511 n511Var = (n511) obj;
                return new ne5(n511Var.a, n511Var.b, n511Var.c, n511Var.d);
            case 9:
                ne5 ne5Var = (ne5) obj;
                return new n511(ne5Var.a, ne5Var.b, ne5Var.c, ne5Var.d);
            case 10:
                return Float.valueOf(((ke5) obj).a);
            case 11:
                return ((osl1) obj).l;
            case 12:
                return ((osl1) obj).m;
            case 13:
                return ((osl1) obj).g;
            case 14:
                return ((osl1) obj).b;
            case 15:
                return ((osl1) obj).f;
            case 16:
                return ((osl1) obj).c;
            case 17:
                return ((osl1) obj).e;
            case 18:
                return ((nhl) obj).getClass().getSimpleName();
            case 19:
                d441 d441VarG1 = ((y341) obj).g1("DELETE FROM WorkProgress");
                try {
                    d441VarG1.f1();
                    return rih1.a;
                } finally {
                    d441VarG1.close();
                }
            case 20:
                y341 y341Var = (y341) obj;
                d441 d441VarG2 = y341Var.g1("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    d441VarG2.f1();
                    return Integer.valueOf(jhc1.x(y341Var));
                } finally {
                    d441VarG2.close();
                }
            case 21:
                d441 d441VarG3 = ((y341) obj).g1("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
                    int iW = y7y0.w(d441VarG3, "id");
                    int iW2 = y7y0.w(d441VarG3, "state");
                    int iW3 = y7y0.w(d441VarG3, "worker_class_name");
                    int iW4 = y7y0.w(d441VarG3, "input_merger_class_name");
                    int iW5 = y7y0.w(d441VarG3, "input");
                    int iW6 = y7y0.w(d441VarG3, "output");
                    int iW7 = y7y0.w(d441VarG3, "initial_delay");
                    int iW8 = y7y0.w(d441VarG3, "interval_duration");
                    int iW9 = y7y0.w(d441VarG3, "flex_duration");
                    int iW10 = y7y0.w(d441VarG3, "run_attempt_count");
                    int iW11 = y7y0.w(d441VarG3, "backoff_policy");
                    int iW12 = y7y0.w(d441VarG3, "backoff_delay_duration");
                    int iW13 = y7y0.w(d441VarG3, "last_enqueue_time");
                    int iW14 = y7y0.w(d441VarG3, "minimum_retention_duration");
                    int iW15 = y7y0.w(d441VarG3, "schedule_requested_at");
                    int iW16 = y7y0.w(d441VarG3, "run_in_foreground");
                    int iW17 = y7y0.w(d441VarG3, "out_of_quota_policy");
                    int iW18 = y7y0.w(d441VarG3, "period_count");
                    int iW19 = y7y0.w(d441VarG3, "generation");
                    int iW20 = y7y0.w(d441VarG3, "next_schedule_time_override");
                    int iW21 = y7y0.w(d441VarG3, "next_schedule_time_override_generation");
                    int iW22 = y7y0.w(d441VarG3, "stop_reason");
                    int iW23 = y7y0.w(d441VarG3, "trace_tag");
                    int iW24 = y7y0.w(d441VarG3, "backoff_on_system_interruptions");
                    int iW25 = y7y0.w(d441VarG3, "required_network_type");
                    int iW26 = y7y0.w(d441VarG3, "required_network_request");
                    int iW27 = y7y0.w(d441VarG3, "requires_charging");
                    int iW28 = y7y0.w(d441VarG3, "requires_device_idle");
                    int iW29 = y7y0.w(d441VarG3, "requires_battery_not_low");
                    int iW30 = y7y0.w(d441VarG3, "requires_storage_not_low");
                    int iW31 = y7y0.w(d441VarG3, "trigger_content_update_delay");
                    int iW32 = y7y0.w(d441VarG3, "trigger_max_content_delay");
                    int iW33 = y7y0.w(d441VarG3, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (d441VarG3.f1()) {
                        String strP0 = d441VarG3.P0(iW);
                        int i = iW14;
                        int i2 = iW13;
                        wvl1 wvl1VarM = cwl1.M((int) d441VarG3.getLong(iW2));
                        String strP1 = d441VarG3.P0(iW3);
                        String strP2 = d441VarG3.P0(iW4);
                        byte[] blob = d441VarG3.getBlob(iW5);
                        ewq ewqVar = ewq.b;
                        ewq ewqVarA = o0c.A(blob);
                        ewq ewqVarA2 = o0c.A(d441VarG3.getBlob(iW6));
                        long j3 = d441VarG3.getLong(iW7);
                        long j4 = d441VarG3.getLong(iW8);
                        long j5 = d441VarG3.getLong(iW9);
                        int i3 = (int) d441VarG3.getLong(iW10);
                        int i4 = iW3;
                        int i5 = iW2;
                        h0a h0aVarJ = cwl1.J((int) d441VarG3.getLong(iW11));
                        long j6 = d441VarG3.getLong(iW12);
                        long j7 = d441VarG3.getLong(i2);
                        long j8 = d441VarG3.getLong(i);
                        int i6 = iW15;
                        long j9 = d441VarG3.getLong(i6);
                        iW15 = i6;
                        int i7 = iW16;
                        int i8 = iW;
                        boolean z = ((int) d441VarG3.getLong(i7)) != 0;
                        int i9 = iW4;
                        int i10 = iW17;
                        int iL = cwl1.L((int) d441VarG3.getLong(i10));
                        iW17 = i10;
                        int i11 = iW18;
                        int i12 = (int) d441VarG3.getLong(i11);
                        iW18 = i11;
                        int i13 = iW19;
                        int i14 = (int) d441VarG3.getLong(i13);
                        int i15 = iW20;
                        long j10 = d441VarG3.getLong(i15);
                        int i16 = iW21;
                        int i17 = (int) d441VarG3.getLong(i16);
                        int i18 = iW22;
                        int i19 = (int) d441VarG3.getLong(i18);
                        int i20 = iW23;
                        String strP3 = d441VarG3.isNull(i20) ? null : d441VarG3.P0(i20);
                        int i21 = iW24;
                        Integer numValueOf = d441VarG3.isNull(i21) ? null : Integer.valueOf((int) d441VarG3.getLong(i21));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        int i22 = iW25;
                        int iK = cwl1.K((int) d441VarG3.getLong(i22));
                        int i23 = iW26;
                        e8o0 e8o0VarQ0 = cwl1.q0(d441VarG3.getBlob(i23));
                        int i24 = iW27;
                        boolean z2 = ((int) d441VarG3.getLong(i24)) != 0;
                        int i25 = iW28;
                        boolean z3 = ((int) d441VarG3.getLong(i25)) != 0;
                        int i26 = iW29;
                        boolean z4 = ((int) d441VarG3.getLong(i26)) != 0;
                        iW29 = i26;
                        int i27 = iW30;
                        int i28 = iW31;
                        int i29 = iW32;
                        iW31 = i28;
                        int i30 = iW33;
                        iW33 = i30;
                        arrayList.add(new vwl1(strP0, wvl1VarM, strP1, strP2, ewqVarA, ewqVarA2, j3, j4, j5, new gjl(e8o0VarQ0, iK, z2, z3, z4, ((int) d441VarG3.getLong(i27)) != 0, d441VarG3.getLong(i28), d441VarG3.getLong(i29), cwl1.k(d441VarG3.getBlob(i30))), i3, h0aVarJ, j6, j7, j8, j9, z, iL, i12, i14, j10, i17, i19, strP3, boolValueOf));
                        iW = i8;
                        iW16 = i7;
                        iW19 = i13;
                        iW21 = i16;
                        iW22 = i18;
                        iW23 = i20;
                        iW24 = i21;
                        iW25 = i22;
                        iW26 = i23;
                        iW32 = i29;
                        iW30 = i27;
                        iW2 = i5;
                        iW4 = i9;
                        iW20 = i15;
                        iW27 = i24;
                        iW13 = i2;
                        iW3 = i4;
                        iW28 = i25;
                        iW14 = i;
                        break;
                    }
                    return arrayList;
                } finally {
                    d441VarG3.close();
                }
            case 22:
                d441 d441VarG4 = ((y341) obj).g1("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                try {
                    d441VarG4.r(1, 20L);
                    int iW34 = y7y0.w(d441VarG4, "id");
                    int iW35 = y7y0.w(d441VarG4, "state");
                    int iW36 = y7y0.w(d441VarG4, "worker_class_name");
                    int iW37 = y7y0.w(d441VarG4, "input_merger_class_name");
                    int iW38 = y7y0.w(d441VarG4, "input");
                    int iW39 = y7y0.w(d441VarG4, "output");
                    int iW40 = y7y0.w(d441VarG4, "initial_delay");
                    int iW41 = y7y0.w(d441VarG4, "interval_duration");
                    int iW42 = y7y0.w(d441VarG4, "flex_duration");
                    int iW43 = y7y0.w(d441VarG4, "run_attempt_count");
                    int iW44 = y7y0.w(d441VarG4, "backoff_policy");
                    int iW45 = y7y0.w(d441VarG4, "backoff_delay_duration");
                    int iW46 = y7y0.w(d441VarG4, "last_enqueue_time");
                    int iW47 = y7y0.w(d441VarG4, "minimum_retention_duration");
                    int iW48 = y7y0.w(d441VarG4, "schedule_requested_at");
                    int iW49 = y7y0.w(d441VarG4, "run_in_foreground");
                    int iW50 = y7y0.w(d441VarG4, "out_of_quota_policy");
                    int iW51 = y7y0.w(d441VarG4, "period_count");
                    int iW52 = y7y0.w(d441VarG4, "generation");
                    int iW53 = y7y0.w(d441VarG4, "next_schedule_time_override");
                    int iW54 = y7y0.w(d441VarG4, "next_schedule_time_override_generation");
                    int iW55 = y7y0.w(d441VarG4, "stop_reason");
                    int iW56 = y7y0.w(d441VarG4, "trace_tag");
                    int iW57 = y7y0.w(d441VarG4, "backoff_on_system_interruptions");
                    int iW58 = y7y0.w(d441VarG4, "required_network_type");
                    int iW59 = y7y0.w(d441VarG4, "required_network_request");
                    int iW60 = y7y0.w(d441VarG4, "requires_charging");
                    int iW61 = y7y0.w(d441VarG4, "requires_device_idle");
                    int iW62 = y7y0.w(d441VarG4, "requires_battery_not_low");
                    int iW63 = y7y0.w(d441VarG4, "requires_storage_not_low");
                    int iW64 = y7y0.w(d441VarG4, "trigger_content_update_delay");
                    int iW65 = y7y0.w(d441VarG4, "trigger_max_content_delay");
                    int iW66 = y7y0.w(d441VarG4, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (d441VarG4.f1()) {
                        String strP4 = d441VarG4.P0(iW34);
                        int i31 = iW46;
                        int i32 = iW47;
                        wvl1 wvl1VarM2 = cwl1.M((int) d441VarG4.getLong(iW35));
                        String strP5 = d441VarG4.P0(iW36);
                        String strP6 = d441VarG4.P0(iW37);
                        byte[] blob2 = d441VarG4.getBlob(iW38);
                        ewq ewqVar2 = ewq.b;
                        ewq ewqVarA3 = o0c.A(blob2);
                        ewq ewqVarA4 = o0c.A(d441VarG4.getBlob(iW39));
                        long j11 = d441VarG4.getLong(iW40);
                        long j12 = d441VarG4.getLong(iW41);
                        long j13 = d441VarG4.getLong(iW42);
                        int i33 = (int) d441VarG4.getLong(iW43);
                        int i34 = iW36;
                        int i35 = iW35;
                        h0a h0aVarJ2 = cwl1.J((int) d441VarG4.getLong(iW44));
                        long j14 = d441VarG4.getLong(iW45);
                        long j15 = d441VarG4.getLong(i31);
                        long j16 = d441VarG4.getLong(i32);
                        int i36 = iW48;
                        long j17 = d441VarG4.getLong(i36);
                        int i37 = iW34;
                        int i38 = iW49;
                        boolean z5 = ((int) d441VarG4.getLong(i38)) != 0;
                        int i39 = iW37;
                        int i40 = iW38;
                        int i41 = iW50;
                        int iL2 = cwl1.L((int) d441VarG4.getLong(i41));
                        iW50 = i41;
                        int i42 = iW51;
                        int i43 = (int) d441VarG4.getLong(i42);
                        iW51 = i42;
                        int i44 = iW52;
                        int i45 = (int) d441VarG4.getLong(i44);
                        int i46 = iW53;
                        long j18 = d441VarG4.getLong(i46);
                        int i47 = iW54;
                        int i48 = (int) d441VarG4.getLong(i47);
                        int i49 = iW55;
                        int i50 = (int) d441VarG4.getLong(i49);
                        int i51 = iW56;
                        String strP7 = d441VarG4.isNull(i51) ? null : d441VarG4.P0(i51);
                        int i52 = iW57;
                        Integer numValueOf2 = d441VarG4.isNull(i52) ? null : Integer.valueOf((int) d441VarG4.getLong(i52));
                        if (numValueOf2 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        int i53 = iW58;
                        int iK2 = cwl1.K((int) d441VarG4.getLong(i53));
                        int i54 = iW59;
                        e8o0 e8o0VarQ1 = cwl1.q0(d441VarG4.getBlob(i54));
                        int i55 = iW60;
                        boolean z6 = ((int) d441VarG4.getLong(i55)) != 0;
                        int i56 = iW61;
                        boolean z7 = ((int) d441VarG4.getLong(i56)) != 0;
                        int i57 = iW62;
                        boolean z8 = ((int) d441VarG4.getLong(i57)) != 0;
                        iW62 = i57;
                        int i58 = iW63;
                        int i59 = iW64;
                        int i60 = iW65;
                        iW64 = i59;
                        int i61 = iW66;
                        arrayList2.add(new vwl1(strP4, wvl1VarM2, strP5, strP6, ewqVarA3, ewqVarA4, j11, j12, j13, new gjl(e8o0VarQ1, iK2, z6, z7, z8, ((int) d441VarG4.getLong(i58)) != 0, d441VarG4.getLong(i59), d441VarG4.getLong(i60), cwl1.k(d441VarG4.getBlob(i61))), i33, h0aVarJ2, j14, j15, j16, j17, z5, iL2, i43, i45, j18, i48, i50, strP7, boolValueOf2));
                        iW61 = i56;
                        iW38 = i40;
                        iW53 = i46;
                        iW60 = i55;
                        iW66 = i61;
                        iW65 = i60;
                        iW63 = i58;
                        iW46 = i31;
                        iW35 = i35;
                        iW36 = i34;
                        iW37 = i39;
                        iW49 = i38;
                        iW52 = i44;
                        iW54 = i47;
                        iW55 = i49;
                        iW56 = i51;
                        iW57 = i52;
                        iW58 = i53;
                        iW59 = i54;
                        iW34 = i37;
                        iW48 = i36;
                        iW47 = i32;
                        break;
                    }
                    return arrayList2;
                } finally {
                    d441VarG4.close();
                }
            case 23:
                d441 d441VarG5 = ((y341) obj).g1("SELECT * FROM workspec WHERE state=1");
                try {
                    int iW67 = y7y0.w(d441VarG5, "id");
                    int iW68 = y7y0.w(d441VarG5, "state");
                    int iW69 = y7y0.w(d441VarG5, "worker_class_name");
                    int iW70 = y7y0.w(d441VarG5, "input_merger_class_name");
                    int iW71 = y7y0.w(d441VarG5, "input");
                    int iW72 = y7y0.w(d441VarG5, "output");
                    int iW73 = y7y0.w(d441VarG5, "initial_delay");
                    int iW74 = y7y0.w(d441VarG5, "interval_duration");
                    int iW75 = y7y0.w(d441VarG5, "flex_duration");
                    int iW76 = y7y0.w(d441VarG5, "run_attempt_count");
                    int iW77 = y7y0.w(d441VarG5, "backoff_policy");
                    int iW78 = y7y0.w(d441VarG5, "backoff_delay_duration");
                    int iW79 = y7y0.w(d441VarG5, "last_enqueue_time");
                    int iW80 = y7y0.w(d441VarG5, "minimum_retention_duration");
                    int iW81 = y7y0.w(d441VarG5, "schedule_requested_at");
                    int iW82 = y7y0.w(d441VarG5, "run_in_foreground");
                    int iW83 = y7y0.w(d441VarG5, "out_of_quota_policy");
                    int iW84 = y7y0.w(d441VarG5, "period_count");
                    int iW85 = y7y0.w(d441VarG5, "generation");
                    int iW86 = y7y0.w(d441VarG5, "next_schedule_time_override");
                    int iW87 = y7y0.w(d441VarG5, "next_schedule_time_override_generation");
                    int iW88 = y7y0.w(d441VarG5, "stop_reason");
                    int iW89 = y7y0.w(d441VarG5, "trace_tag");
                    int iW90 = y7y0.w(d441VarG5, "backoff_on_system_interruptions");
                    int iW91 = y7y0.w(d441VarG5, "required_network_type");
                    int iW92 = y7y0.w(d441VarG5, "required_network_request");
                    int iW93 = y7y0.w(d441VarG5, "requires_charging");
                    int iW94 = y7y0.w(d441VarG5, "requires_device_idle");
                    int iW95 = y7y0.w(d441VarG5, "requires_battery_not_low");
                    int iW96 = y7y0.w(d441VarG5, "requires_storage_not_low");
                    int iW97 = y7y0.w(d441VarG5, "trigger_content_update_delay");
                    int iW98 = y7y0.w(d441VarG5, "trigger_max_content_delay");
                    int iW99 = y7y0.w(d441VarG5, "content_uri_triggers");
                    ArrayList arrayList3 = new ArrayList();
                    while (d441VarG5.f1()) {
                        String strP8 = d441VarG5.P0(iW67);
                        int i62 = iW80;
                        int i63 = iW79;
                        wvl1 wvl1VarM3 = cwl1.M((int) d441VarG5.getLong(iW68));
                        String strP9 = d441VarG5.P0(iW69);
                        String strP10 = d441VarG5.P0(iW70);
                        byte[] blob3 = d441VarG5.getBlob(iW71);
                        ewq ewqVar3 = ewq.b;
                        ewq ewqVarA5 = o0c.A(blob3);
                        ewq ewqVarA6 = o0c.A(d441VarG5.getBlob(iW72));
                        long j19 = d441VarG5.getLong(iW73);
                        long j20 = d441VarG5.getLong(iW74);
                        long j21 = d441VarG5.getLong(iW75);
                        int i64 = (int) d441VarG5.getLong(iW76);
                        int i65 = iW69;
                        int i66 = iW68;
                        h0a h0aVarJ3 = cwl1.J((int) d441VarG5.getLong(iW77));
                        long j22 = d441VarG5.getLong(iW78);
                        long j23 = d441VarG5.getLong(i63);
                        long j24 = d441VarG5.getLong(i62);
                        int i67 = iW81;
                        long j25 = d441VarG5.getLong(i67);
                        int i68 = iW67;
                        int i69 = iW82;
                        boolean z9 = ((int) d441VarG5.getLong(i69)) != 0;
                        int i70 = iW70;
                        int i71 = iW83;
                        int iL3 = cwl1.L((int) d441VarG5.getLong(i71));
                        int i72 = iW84;
                        int i73 = (int) d441VarG5.getLong(i72);
                        int i74 = iW85;
                        int i75 = (int) d441VarG5.getLong(i74);
                        long j26 = d441VarG5.getLong(iW86);
                        int i76 = iW87;
                        int i77 = (int) d441VarG5.getLong(i76);
                        iW87 = i76;
                        iW88 = iW88;
                        int i78 = (int) d441VarG5.getLong(iW88);
                        iW89 = iW89;
                        String strP11 = d441VarG5.isNull(iW89) ? null : d441VarG5.P0(iW89);
                        int i79 = iW90;
                        Integer numValueOf3 = d441VarG5.isNull(i79) ? null : Integer.valueOf((int) d441VarG5.getLong(i79));
                        if (numValueOf3 != null) {
                            boolValueOf3 = Boolean.valueOf(numValueOf3.intValue() != 0);
                        } else {
                            boolValueOf3 = null;
                        }
                        int i80 = iW91;
                        int iK3 = cwl1.K((int) d441VarG5.getLong(i80));
                        int i81 = iW92;
                        e8o0 e8o0VarQ2 = cwl1.q0(d441VarG5.getBlob(i81));
                        iW90 = i79;
                        iW91 = i80;
                        int i82 = iW93;
                        boolean z10 = ((int) d441VarG5.getLong(i82)) != 0;
                        int i83 = iW94;
                        boolean z11 = ((int) d441VarG5.getLong(i83)) != 0;
                        iW93 = i82;
                        int i84 = iW95;
                        boolean z12 = ((int) d441VarG5.getLong(i84)) != 0;
                        iW94 = i83;
                        iW95 = i84;
                        int i85 = iW96;
                        int i86 = iW97;
                        int i87 = iW98;
                        int i88 = iW99;
                        iW97 = i86;
                        arrayList3.add(new vwl1(strP8, wvl1VarM3, strP9, strP10, ewqVarA5, ewqVarA6, j19, j20, j21, new gjl(e8o0VarQ2, iK3, z10, z11, z12, ((int) d441VarG5.getLong(i85)) != 0, d441VarG5.getLong(i86), d441VarG5.getLong(i87), cwl1.k(d441VarG5.getBlob(i88))), i64, h0aVarJ3, j22, j23, j24, j25, z9, iL3, i73, i75, j26, i77, i78, strP11, boolValueOf3));
                        iW98 = i87;
                        iW96 = i85;
                        iW99 = i88;
                        iW80 = i62;
                        iW68 = i66;
                        iW69 = i65;
                        iW70 = i70;
                        iW82 = i69;
                        iW83 = i71;
                        iW84 = i72;
                        iW85 = i74;
                        iW92 = i81;
                        iW67 = i68;
                        iW81 = i67;
                        iW79 = i63;
                        break;
                    }
                    return arrayList3;
                } finally {
                    d441VarG5.close();
                }
            case 24:
                d441 d441VarG6 = ((y341) obj).g1("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
                try {
                    d441VarG6.K(1, "com.spotify.widgets.npvwidget.TAG_HIDE_TOOLTIP");
                    ArrayList arrayList4 = new ArrayList();
                    while (d441VarG6.f1()) {
                        arrayList4.add(d441VarG6.P0(0));
                    }
                    d441VarG6.close();
                    return arrayList4;
                } catch (Throwable th) {
                    d441VarG6.close();
                    throw th;
                }
            case 25:
                return a(obj);
            case 26:
                return d(obj);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return e(obj);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return f(obj);
            default:
                return Boolean.TRUE;
        }
    }
}
