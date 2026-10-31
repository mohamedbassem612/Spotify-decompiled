package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class gc4 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;

    public /* synthetic */ gc4(byte b, long j) {
        this.a = b;
        this.b = j;
    }

    public final Object invoke(Object obj) throws Exception {
        ohd ohdVar;
        Object m231Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        long j = this.b;
        switch (b) {
            case 0:
                eqc eqcVar = (eqc) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) / 2.0f;
                return eqcVar.b(new hc4(fIntBitsToFloat, t4n1.o(eqcVar, fIntBitsToFloat), new f2b(j, 5), (byte) 0));
            case 1:
                t5c t5cVar = (t5c) obj;
                iu30 iu30Var = t5cVar.b;
                if (iu30Var != null && (ohdVar = t5cVar.a) != null) {
                    try {
                        m231Var = iu30Var.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        m231Var = new m231(th);
                    }
                    ohdVar.resumeWith(m231Var);
                    break;
                }
                return rih1Var;
            case 2:
                ((e261) obj).b(px51.a, new ox51(qr50.a, this.b, 2, true));
                return rih1Var;
            case 3:
                DrawScope drawScope = (DrawScope) obj;
                DrawScope.p0(drawScope, this.b, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(drawScope.X0(1.0f) / 2.0f)) << 32), (((long) Float.floatToRawIntBits(drawScope.X0(1.0f) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)))) & 4294967295L), drawScope.X0(1.0f), 0, (uw4) null, 496);
                return rih1Var;
            case 4:
                return Long.valueOf(j);
            default:
                d441 d441VarG1 = ((y341) obj).g1("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    d441VarG1.r(1, j);
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
                        int i = iW12;
                        int i2 = iW13;
                        wvl1 wvl1VarM = cwl1.M((int) d441VarG1.getLong(iW2));
                        String strP1 = d441VarG1.P0(iW3);
                        String strP2 = d441VarG1.P0(iW4);
                        byte[] blob = d441VarG1.getBlob(iW5);
                        ewq ewqVar = ewq.b;
                        ewq ewqVarA = o0c.A(blob);
                        ewq ewqVarA2 = o0c.A(d441VarG1.getBlob(iW6));
                        long j2 = d441VarG1.getLong(iW7);
                        long j3 = d441VarG1.getLong(iW8);
                        long j4 = d441VarG1.getLong(iW9);
                        int i3 = (int) d441VarG1.getLong(iW10);
                        int i4 = iW;
                        int i5 = iW2;
                        h0a h0aVarJ = cwl1.J((int) d441VarG1.getLong(iW11));
                        long j5 = d441VarG1.getLong(i);
                        long j6 = d441VarG1.getLong(i2);
                        long j7 = d441VarG1.getLong(iW14);
                        int i6 = iW14;
                        int i7 = iW15;
                        long j8 = d441VarG1.getLong(i7);
                        iW15 = i7;
                        int i8 = iW16;
                        boolean z = ((int) d441VarG1.getLong(i8)) != 0;
                        int i9 = iW3;
                        int i10 = iW17;
                        int i11 = iW4;
                        int iL = cwl1.L((int) d441VarG1.getLong(i10));
                        int i12 = iW18;
                        int i13 = (int) d441VarG1.getLong(i12);
                        int i14 = iW19;
                        int i15 = (int) d441VarG1.getLong(i14);
                        int i16 = iW20;
                        long j9 = d441VarG1.getLong(i16);
                        int i17 = iW21;
                        int i18 = (int) d441VarG1.getLong(i17);
                        int i19 = iW22;
                        int i20 = (int) d441VarG1.getLong(i19);
                        int i21 = iW23;
                        String strP3 = d441VarG1.isNull(i21) ? null : d441VarG1.P0(i21);
                        int i22 = iW24;
                        Integer numValueOf = d441VarG1.isNull(i22) ? null : Integer.valueOf((int) d441VarG1.getLong(i22));
                        Boolean boolValueOf = numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null;
                        int i23 = iW25;
                        Boolean bool = boolValueOf;
                        int iK = cwl1.K((int) d441VarG1.getLong(i23));
                        int i24 = iW26;
                        e8o0 e8o0VarQ0 = cwl1.q0(d441VarG1.getBlob(i24));
                        iW25 = i23;
                        int i25 = iW27;
                        boolean z2 = ((int) d441VarG1.getLong(i25)) != 0;
                        iW27 = i25;
                        int i26 = iW28;
                        boolean z3 = ((int) d441VarG1.getLong(i26)) != 0;
                        iW28 = i26;
                        int i27 = iW29;
                        boolean z4 = ((int) d441VarG1.getLong(i27)) != 0;
                        iW29 = i27;
                        int i28 = iW30;
                        int i29 = iW31;
                        int i30 = iW32;
                        int i31 = iW33;
                        arrayList.add(new vwl1(strP0, wvl1VarM, strP1, strP2, ewqVarA, ewqVarA2, j2, j3, j4, new gjl(e8o0VarQ0, iK, z2, z3, z4, ((int) d441VarG1.getLong(i28)) != 0, d441VarG1.getLong(i29), d441VarG1.getLong(i30), cwl1.k(d441VarG1.getBlob(i31))), i3, h0aVarJ, j5, j6, j7, j8, z, iL, i13, i15, j9, i18, i20, strP3, bool));
                        iW33 = i31;
                        iW31 = i29;
                        iW32 = i30;
                        iW12 = i;
                        iW4 = i11;
                        iW3 = i9;
                        iW18 = i12;
                        iW16 = i8;
                        iW19 = i14;
                        iW20 = i16;
                        iW21 = i17;
                        iW22 = i19;
                        iW23 = i21;
                        iW24 = i22;
                        iW14 = i6;
                        iW17 = i10;
                        iW30 = i28;
                        iW26 = i24;
                        iW = i4;
                        iW13 = i2;
                        iW2 = i5;
                        break;
                    }
                    return arrayList;
                } finally {
                    d441VarG1.close();
                }
        }
    }
}
