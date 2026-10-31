package p;

import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rhg extends ClickableSpan {
    public final String a;
    public final lzn0 b;
    public final i8h1 c;

    public rhg(String str, lzn0 lzn0Var, i8h1 i8h1Var) {
        this.a = str;
        this.b = lzn0Var;
        this.c = i8h1Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-track-page-free";
        x6h1VarI.f = "5.1.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.e = "";
        x6h1 x6h1VarR = kk0.r(x6h1VarI, "free-tier-track");
        x6h1VarR.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarR.j = false;
        x6h1 x6h1VarC = x6h1VarR.a().c();
        x6h1VarC.i.add(new a7h1("creator_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        String str = this.a;
        this.b.a(str, this.c.m(new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(-1);
    }
}
