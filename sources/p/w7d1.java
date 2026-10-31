package p;

import android.content.ClipDescription;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class w7d1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w7d1(w7d1 w7d1Var, k7b1 k7b1Var) {
        this.a = (byte) 4;
        this.b = w7d1Var;
    }

    public final Object invoke(Object obj) throws Exception {
        boolean z;
        boolean z2;
        byte b = this.a;
        int i = 4;
        int i2 = 3;
        int i3 = 2;
        int i4 = 1;
        int i5 = 0;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                de5 de5Var = (de5) obj;
                ((rsl1) obj2).invoke(de5Var.e.getValue(), Float.valueOf(de5Var.f.a));
                return rih1Var;
            case 1:
                ((Float) obj).getClass();
                return Float.valueOf(((wat) obj2).X0(56.0f));
            case 2:
                Drawable drawable = (Drawable) obj2;
                DrawScope drawScope = (DrawScope) obj;
                u84 u84VarP = drawScope.a1().p();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (drawScope.j() >> 32)), (int) Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)));
                Canvas canvas = v84.a;
                drawable.draw(u84VarP.a);
                return rih1Var;
            case 3:
                ((iu30) obj).invoke((d3e1) obj2);
                return rih1Var;
            case 4:
                w7d1 w7d1Var = (w7d1) obj2;
                dpg1 dpg1Var = (dpg1) obj;
                if (dpg1Var instanceof fk1) {
                    w7d1Var.invoke(((fk1) dpg1Var).O0);
                    return Boolean.TRUE;
                }
                eg.m("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case 5:
                n4e1 n4e1Var = (n4e1) obj2;
                elb0 elb0Var = (elb0) obj;
                n511 n511Var = (n511) n4e1Var.U0.y.getValue();
                if (n511Var == null) {
                    n511Var = n511.e;
                }
                elb0 elb0VarE = n4e1Var.S0.e();
                if (elb0VarE != null) {
                    return nko1.J(n511Var, elb0VarE, elb0Var);
                }
                tf80.d("Required value was null.");
                jah.d();
                return null;
            case 6:
                ClipDescription clipDescription = ((x3v) obj).a.getClipDescription();
                Iterable iterable = (Iterable) ((s4e1) obj2).invoke();
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    z2 = false;
                } else {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            t8i0 t8i0Var = (t8i0) it.next();
                            if (u890.j(t8i0Var, t8i0.c)) {
                                z = true;
                            } else if (clipDescription != null) {
                                z = true;
                                if (clipDescription.hasMimeType(t8i0Var.a)) {
                                }
                            }
                            z2 = z;
                        } else {
                            z2 = false;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case 7:
                r6e1 r6e1Var = (r6e1) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                drr0 drr0Var = r6e1Var.a;
                float fS = drr0Var.s() + fFloatValue;
                drr0 drr0Var2 = r6e1Var.b;
                if (fS > drr0Var2.s()) {
                    fFloatValue = drr0Var2.s() - drr0Var.s();
                } else if (fS < 0.0f) {
                    fFloatValue = -drr0Var.s();
                }
                drr0Var.t(drr0Var.s() + fFloatValue);
                return Float.valueOf(fFloatValue);
            case 8:
                yye1 yye1Var = (yye1) obj2;
                View view = yye1Var.a;
                rwq0.s(view, new gjm(yye1Var, view, (byte) 4));
                return rih1Var;
            case 9:
                return (elb0) ((r5f1) obj2).a.invoke();
            case 10:
                ((sfg1) obj2).R0.getClass();
                return Boolean.TRUE;
            case 11:
                ((fai0) obj2).m(obj);
                return rih1Var;
            case 12:
                return new kcf1((mhg1) obj2, (byte) 2);
            case 13:
                return new kz6((bjg1) obj2, (byte) 3);
            case 14:
                zvg1 zvg1Var = (zvg1) obj2;
                neg negVar = (neg) obj;
                neg.b(negVar, "first", zvg1Var.a.getDescriptor(), 12);
                neg.b(negVar, "second", zvg1Var.b.getDescriptor(), 12);
                neg.b(negVar, "third", zvg1Var.c.getDescriptor(), 12);
                return rih1Var;
            default:
                dxl1 dxl1Var = (dxl1) obj2;
                y341 y341Var = (y341) obj;
                d441 d441VarG1 = y341Var.g1("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    d441VarG1.K(1, "cache_moving_worker");
                    y36 y36Var = new y36(0);
                    Map y36Var2 = new y36(0);
                    while (d441VarG1.f1()) {
                        String strP0 = d441VarG1.P0(0);
                        if (!y36Var.containsKey(strP0)) {
                            y36Var.put(strP0, new ArrayList());
                        }
                        String strP1 = d441VarG1.P0(0);
                        if (!y36Var2.containsKey(strP1)) {
                            y36Var2.put(strP1, new ArrayList());
                        }
                    }
                    d441VarG1.reset();
                    dxl1Var.b(y341Var, y36Var);
                    dxl1Var.a(y341Var, y36Var2);
                    ArrayList arrayList = new ArrayList();
                    while (d441VarG1.f1()) {
                        String strP2 = d441VarG1.P0(i5);
                        wvl1 wvl1VarM = cwl1.M((int) d441VarG1.getLong(i4));
                        byte[] blob = d441VarG1.getBlob(i3);
                        ewq ewqVar = ewq.b;
                        ewq ewqVarA = o0c.A(blob);
                        int i6 = (int) d441VarG1.getLong(i2);
                        int i7 = (int) d441VarG1.getLong(i);
                        Map map = y36Var2;
                        y36Var2 = map;
                        arrayList.add(new uwl1(strP2, wvl1VarM, ewqVarA, d441VarG1.getLong(14), d441VarG1.getLong(15), d441VarG1.getLong(16), new gjl(cwl1.q0(d441VarG1.getBlob(6)), cwl1.K((int) d441VarG1.getLong(5)), ((int) d441VarG1.getLong(7)) != 0, ((int) d441VarG1.getLong(8)) != 0, ((int) d441VarG1.getLong(9)) != 0, ((int) d441VarG1.getLong(10)) != 0, d441VarG1.getLong(11), d441VarG1.getLong(12), cwl1.k(d441VarG1.getBlob(13))), i6, cwl1.J((int) d441VarG1.getLong(17)), d441VarG1.getLong(18), d441VarG1.getLong(19), (int) d441VarG1.getLong(20), i7, d441VarG1.getLong(21), (int) d441VarG1.getLong(22), (List) sqg0.G(d441VarG1.P0(0), y36Var), (List) sqg0.G(d441VarG1.P0(0), y36Var2)));
                        i = 4;
                        i2 = 3;
                        i3 = 2;
                        i4 = 1;
                        i5 = 0;
                        break;
                    }
                    return arrayList;
                } finally {
                    d441VarG1.close();
                }
        }
    }

    public /* synthetic */ w7d1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
