package p;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import java.text.DecimalFormat;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class imd0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jmd0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ imd0(jmd0 jmd0Var, byte b) {
        super(1);
        this.a = b;
        this.b = jmd0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        jmd0 jmd0Var = this.b;
        switch (b) {
            case 0:
                b261.B((e261) obj, jmd0Var.t);
                return rih1.a;
            default:
                Context context = (Context) obj;
                q8a q8aVar = new q8a(context);
                int color = context.getColor(2131104258);
                q8aVar.setDrawGridBackground(false);
                q8aVar.setDrawValueAboveBar(false);
                q8aVar.setDrawBorders(false);
                q8aVar.getXAxis().n = false;
                q8aVar.getXAxis().y = 2;
                q8aVar.getXAxis().o = true;
                q8aVar.getXAxis().d = color;
                q8aVar.getXAxis().k = true;
                q8aVar.getXAxis().k = true;
                wjm1 xAxis = q8aVar.getXAxis();
                int size = jmd0Var.g.size();
                xAxis.getClass();
                if (size > 25) {
                    size = 25;
                }
                if (size < 2) {
                    size = 2;
                }
                xAxis.i = size;
                xAxis.l = true;
                q8aVar.getXAxis().m = false;
                q8aVar.getXAxis().e = new yxs(jmd0Var);
                q8aVar.getAxisLeft().m = false;
                q8aVar.getAxisLeft().n = false;
                q8aVar.getAxisLeft().o = false;
                ymm1 axisLeft = q8aVar.getAxisLeft();
                float f = jmd0Var.e;
                axisLeft.t = true;
                axisLeft.u = f;
                axisLeft.w = Math.abs(f - axisLeft.v);
                ymm1 axisLeft2 = q8aVar.getAxisLeft();
                axisLeft2.s = true;
                axisLeft2.v = 0.0f;
                axisLeft2.w = Math.abs(axisLeft2.u - 0.0f);
                q8aVar.getAxisRight().m = false;
                ymm1 axisRight = q8aVar.getAxisRight();
                cgc0 cgc0VarK = x1p1.k(f / 2.0f);
                ArrayList arrayList = axisRight.f163p;
                arrayList.add(cgc0VarK);
                arrayList.size();
                ymm1 axisRight2 = q8aVar.getAxisRight();
                cgc0 cgc0VarK2 = x1p1.k(f);
                ArrayList arrayList2 = axisRight2.f163p;
                arrayList2.add(cgc0VarK2);
                arrayList2.size();
                q8aVar.getAxisRight().n = false;
                q8aVar.getAxisRight().o = true;
                ymm1 axisRight3 = q8aVar.getAxisRight();
                axisRight3.j = jmd0Var.f;
                axisRight3.k = true;
                ymm1 axisRight4 = q8aVar.getAxisRight();
                yeb0 yeb0Var = new yeb0();
                yeb0Var.b = new DecimalFormat("###E00");
                axisRight4.e = yeb0Var;
                q8aVar.getAxisRight().d = color;
                ymm1 axisRight5 = q8aVar.getAxisRight();
                int i = jmd0Var.c;
                float f2 = i;
                String strValueOf = String.valueOf(i);
                cgc0 cgc0Var = new cgc0();
                cgc0Var.e = 0.0f;
                cgc0Var.f = 2.0f;
                cgc0Var.g = Color.rgb(237, 91, 91);
                cgc0Var.h = Paint.Style.FILL_AND_STROKE;
                cgc0Var.j = 3;
                cgc0Var.e = f2;
                cgc0Var.i = strValueOf;
                cgc0Var.g = -1;
                cgc0Var.d = -1;
                cgc0Var.f = npi1.c(3.0f);
                cgc0Var.j = 3;
                ArrayList arrayList3 = axisRight5.f163p;
                arrayList3.add(cgc0Var);
                arrayList3.size();
                ymm1 axisRight6 = q8aVar.getAxisRight();
                axisRight6.t = true;
                axisRight6.u = f;
                axisRight6.w = Math.abs(f - axisRight6.v);
                ymm1 axisRight7 = q8aVar.getAxisRight();
                axisRight7.s = true;
                axisRight7.v = 0.0f;
                axisRight7.w = Math.abs(axisRight7.u - 0.0f);
                ymm1 axisRight8 = q8aVar.getAxisRight();
                int i2 = jmd0Var.h;
                axisRight8.getClass();
                int i3 = i2 <= 25 ? i2 : 25;
                if (i3 < 2) {
                    i3 = 2;
                }
                axisRight8.i = i3;
                axisRight8.l = true;
                q8aVar.getAxisRight().getClass();
                q8aVar.getAxisRight().getClass();
                q8aVar.setPinchZoom(false);
                q8aVar.setScaleEnabled(false);
                ArrayList<rzy> arrayList4 = jmd0Var.d;
                ArrayList arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
                for (rzy rzyVar : arrayList4) {
                    arrayList5.add(new v8a(rzyVar.c, rzyVar.a()));
                }
                u8a u8aVar = new u8a(arrayList5);
                int i4 = jmd0Var.b;
                ArrayList arrayList6 = u8aVar.a;
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                    u8aVar.a = arrayList6;
                }
                arrayList6.clear();
                u8aVar.a.add(Integer.valueOf(i4));
                u8aVar.e = false;
                u8aVar.j = false;
                u8aVar.k = false;
                u8aVar.g = 1;
                u8aVar.c = null;
                t8a t8aVar = new t8a(u8aVar);
                t8aVar.j = 0.4f;
                q8aVar.setData(t8aVar);
                ((t8a) q8aVar.getData()).a();
                q8aVar.d();
                q8aVar.setRenderer(new ar31(q8aVar, q8aVar.getAnimator(), q8aVar.getViewPortHandler(), 2));
                q8aVar.getRenderer().w1();
                q8aVar.setDescription(null);
                q8aVar.setContentDescription(jmd0Var.i);
                return q8aVar;
        }
    }
}
