package p;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sus {
    public final ogs a;
    public final Activity b;

    public sus(ogs ogsVar, Activity activity) {
        this.a = ogsVar;
        this.b = activity;
    }

    public static mus b(sus susVar, l5f1 l5f1Var) {
        byte[] bArr = new byte[16];
        wj51.a.nextBytes(bArr);
        byte b = (byte) (bArr[6] & 15);
        bArr[6] = b;
        bArr[6] = (byte) (b | 64);
        byte b2 = (byte) (bArr[8] & 63);
        bArr[8] = b2;
        bArr[8] = (byte) (b2 | 128);
        long jE = fc11.E(bArr, 0);
        long jE2 = fc11.E(bArr, 8);
        return susVar.a(l5f1Var, ((jE == 0 && jE2 == 0) ? eqi1.c : new eqi1(jE, jE2)).toString());
    }

    public final mus a(l5f1 l5f1Var, String str) {
        long length;
        long jLongValue;
        if (!(l5f1Var instanceof px81)) {
            if (!(l5f1Var instanceof oh31)) {
                bhn0.q();
                return null;
            }
            oh31 oh31Var = (oh31) l5f1Var;
            oh31Var.c = new shs(oh31Var.c, (byte) 6);
            oh31Var.b = new shs(oh31Var.b, (byte) 7);
            mus musVarC = c(oh31Var, str, true);
            View view = oh31Var.h;
            if (view != null) {
                musVarC.l = view;
            }
            Long l = oh31Var.g;
            if (l != null) {
                musVarC.t = l.longValue();
            }
            return musVarC;
        }
        px81 px81Var = (px81) l5f1Var;
        px81Var.c = new shs(px81Var.c, (byte) 8);
        px81Var.b = new shs(px81Var.b, (byte) 9);
        mus musVarC2 = c(px81Var, str, false);
        Activity activity = this.b;
        View viewInflate = LayoutInflater.from(activity).inflate(2131626138, (ViewGroup) null);
        viewInflate.getClass();
        ImageView imageView = (ImageView) viewInflate.findViewById(2131429510);
        ox81 ox81Var = px81Var.h;
        if (ox81Var == null) {
            imageView.setVisibility(8);
        } else {
            g4b1 g4b1Var = new g4b1(activity, ox81Var.a, activity.getResources().getDimension(2131167068));
            g4b1Var.b(activity.getColor(2131101695));
            imageView.setImageDrawable(g4b1Var);
            imageView.setVisibility(0);
        }
        TextView textView = (TextView) viewInflate.findViewById(2131431290);
        String str2 = px81Var.i;
        if (str2 == null || ihc1.y0(str2)) {
            textView.setVisibility(8);
        } else {
            textView.setText(px81Var.i);
            textView.setVisibility(0);
            textView.setMaxWidth(activity.getResources().getDimensionPixelSize(px81Var.k != null ? 2131167002 : 2131166787));
            textView.setMaxLines(px81Var.j);
        }
        Button button = (Button) viewInflate.findViewById(2131427867);
        nx81 nx81Var = px81Var.k;
        if (nx81Var == null) {
            button.setVisibility(8);
        } else {
            button.setText(nx81Var.a);
            button.setTextColor(activity.getColor(nx81Var.b));
            button.setOnClickListener(new cvr(nx81Var, musVarC2, (byte) 17));
            button.setOnTouchListener(new lgs(button, (byte) 1));
            button.setVisibility(0);
        }
        musVarC2.l = viewInflate;
        Long l2 = px81Var.g;
        if (l2 != null) {
            jLongValue = l2.longValue();
        } else {
            String str3 = px81Var.i;
            if (str3 == null || ihc1.y0(str3)) {
                length = 0;
            } else {
                String str4 = px81Var.i;
                str4.getClass();
                length = ((long) ihc1.e1(str4).toString().length()) * 200;
                if (length < 4000) {
                    length = 4000;
                }
            }
            if (px81Var.k != null) {
                length += 2000;
                if (length < 6000) {
                    length = 6000;
                }
            }
            jLongValue = length;
            if (jLongValue > 10000) {
                jLongValue = 10000;
            }
        }
        musVarC2.t = jLongValue;
        return musVarC2;
    }

    public final mus c(l5f1 l5f1Var, String str, boolean z) {
        int i = z ? 2132017756 : 2132017755;
        int i2 = l5f1Var.a;
        iu30 iu30Var = l5f1Var.b;
        ogs ogsVar = this.a;
        if (i2 == 0) {
            return new mus(str, ogsVar, iu30Var, l5f1Var.c, l5f1Var.d, 2131166775, i, l5f1Var.e, l5f1Var.f);
        }
        return new mus(str, ogsVar, iu30Var, l5f1Var.c, l5f1Var.d, i2, i, l5f1Var.e, l5f1Var.f);
    }
}
