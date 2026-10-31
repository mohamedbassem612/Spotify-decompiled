package com.spotify.widgets.npvwidget;

import p.a7h1;
import p.b7x;
import p.brl0;
import p.eg;
import p.gwn0;
import p.i3o1;
import p.i8h1;
import p.kk0;
import p.mjl0;
import p.mwn0;
import p.r6h1;
import p.sqk0;
import p.tv80;
import p.u8h1;
import p.w7h1;
import p.x6h1;
import p.x7h1;
import p.xj61;
import p.y6h1;
import p.z7h1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m {
    public final i8h1 a;
    public final mwn0 b;

    public m(i8h1 i8h1Var, mwn0 mwn0Var) {
        this.a = i8h1Var;
        this.b = mwn0Var;
    }

    public static sqk0 a(WidgetInteraction.ItemClick.GridItemClick gridItemClick) {
        mjl0 mjl0Var = new mjl0(new brl0(gridItemClick.getPageIdentifier(), (byte) 25), (byte) 0);
        String string = gridItemClick.getItemUri().toString();
        int itemPosition = gridItemClick.getItemPosition();
        return new sqk0(Integer.valueOf(itemPosition), gridItemClick.getItemReason(), string, mjl0Var);
    }

    public final void b(String str) {
        this.b.g(new gwn0(str, (String) null, (String) null, (u8h1) null, 8));
    }

    public final tv80 c(WidgetInteraction.WrappedDismiss wrappedDismiss) {
        char c;
        String str;
        int i = l.a[wrappedDismiss.getVariant().ordinal()];
        if (i == 1) {
            c = 2;
        } else {
            if (i != 2) {
                eg.o();
                return null;
            }
            c = 1;
        }
        String pageIdentifier = wrappedDismiss.getPageIdentifier();
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-widget-npv-recommendations";
        x6h1VarI.f = "7.2.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = pageIdentifier;
        x6h1 x6h1VarR = kk0.r(x6h1VarI, "any");
        x6h1VarR.i.add(new a7h1("wrapped_section", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarR.j = false;
        x6h1 x6h1VarC = x6h1VarR.a().c();
        if (c == 1) {
            str = "wrapped_playlist";
        } else {
            if (c != 2) {
                throw null;
            }
            str = "wrapped_story";
        }
        x6h1VarC.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, str));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        w7h1 w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis());
        b(wrappedDismiss.getPageIdentifier());
        return this.a.m(w7h1Var, (xj61) null);
    }
}
