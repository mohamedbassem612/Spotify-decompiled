package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class z391 implements e491 {
    public static final /* synthetic */ z391[] N0;
    public static final k391 X;
    public static final l391 Y;
    public static final m391 Z;
    public static final q391 a;
    public static final r391 b;
    public static final t391 c;
    public static final u391 d;
    public static final v391 e;
    public static final w391 f;
    public static final x391 g;
    public static final y391 h;
    public static final i391 i;
    public static final j391 t;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [p.i391] */
    /* JADX WARN: Type inference failed for: r11v0, types: [p.j391] */
    /* JADX WARN: Type inference failed for: r12v0, types: [p.k391] */
    /* JADX WARN: Type inference failed for: r14v0, types: [p.m391] */
    /* JADX WARN: Type inference failed for: r3v0, types: [p.t391] */
    /* JADX WARN: Type inference failed for: r4v0, types: [p.u391] */
    /* JADX WARN: Type inference failed for: r5v0, types: [p.v391] */
    /* JADX WARN: Type inference failed for: r6v0, types: [p.w391] */
    static {
        q391 q391Var = new q391();
        a = q391Var;
        r391 r391Var = new r391();
        b = r391Var;
        z391 z391Var = new z391() { // from class: p.s391
            public final View a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return layoutInflater.inflate(2131626150, viewGroup, false);
            }
        };
        ?? r3 = new z391() { // from class: p.t391
            public final View a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return layoutInflater.inflate(2131626151, viewGroup, false);
            }
        };
        c = r3;
        ?? r4 = new z391() { // from class: p.u391
            public final View a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return layoutInflater.inflate(2131626152, viewGroup, false);
            }
        };
        d = r4;
        ?? r5 = new z391() { // from class: p.v391
            public final View a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return layoutInflater.inflate(2131626153, viewGroup, false);
            }
        };
        e = r5;
        ?? r6 = new z391() { // from class: p.w391
            public final View a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return layoutInflater.inflate(2131626154, viewGroup, false);
            }
        };
        f = r6;
        x391 x391Var = new x391();
        g = x391Var;
        y391 y391Var = new y391();
        h = y391Var;
        z391 z391Var2 = new z391() { // from class: p.h391
            public final View a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
                int iX = a8o.x(8.0f, context.getResources());
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setPadding(iX, 0, iX, 0);
                layoutInflater.inflate(2131626148, (ViewGroup) linearLayout, true);
                return linearLayout;
            }
        };
        ?? r10 = new z391() { // from class: p.i391
            public final View a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
                Resources resources = context.getResources();
                int iX = a8o.x(8.0f, resources);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setPadding(iX, 0, iX, 0);
                int integer = resources.getInteger(2131492874);
                for (int i2 = 0; i2 < integer; i2++) {
                    layoutInflater.inflate(2131626148, (ViewGroup) linearLayout, true);
                }
                return linearLayout;
            }
        };
        i = r10;
        ?? r11 = new z391() { // from class: p.j391
            public final View a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return layoutInflater.inflate(2131626159, viewGroup, false);
            }
        };
        t = r11;
        ?? r12 = new z391() { // from class: p.k391
            public final View a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return layoutInflater.inflate(2131626158, viewGroup, false);
            }
        };
        X = r12;
        l391 l391Var = new l391();
        Y = l391Var;
        ?? r14 = new z391() { // from class: p.m391
            public final View a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return layoutInflater.inflate(2131626161, viewGroup, false);
            }
        };
        Z = r14;
        N0 = new z391[]{q391Var, r391Var, z391Var, r3, r4, r5, r6, x391Var, y391Var, z391Var2, r10, r11, r12, l391Var, r14, new z391() { // from class: p.n391
            public final View a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return layoutInflater.inflate(2131626164, viewGroup, false);
            }
        }, new z391() { // from class: p.o391
            public final View a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return layoutInflater.inflate(2131626163, viewGroup, false);
            }
        }, new z391() { // from class: p.p391
            public final View a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return layoutInflater.inflate(2131626157, viewGroup, false);
            }
        }};
        values();
    }

    public static z391 valueOf(String str) {
        return (z391) Enum.valueOf(z391.class, str);
    }

    public static z391[] values() {
        return (z391[]) N0.clone();
    }
}
