package p;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.aiplaylist.promptcreation.presentation.PromptCreationHeaderView;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ntj extends ClickableSpan {
    public final /* synthetic */ byte a;
    public final Object b;

    public ntj(xap xapVar, SpannableStringBuilder spannableStringBuilder) {
        this.a = (byte) 3;
        this.b = xapVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                mjc0 mjc0Var = (mjc0) obj;
                rjc0 rjc0VarA = mjc0Var.a();
                if (rjc0VarA != null) {
                    rjc0VarA.a(mjc0Var);
                }
                break;
            case 1:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((Context) obj).getString(2131954988))));
                break;
            case 2:
                co6 co6Var = (co6) obj;
                j2e0 j2e0Var = (j2e0) co6Var.c;
                i8h1 i8h1Var = (i8h1) j2e0Var.b;
                ksk0 ksk0Var = (ksk0) j2e0Var.c;
                x6h1 x6h1VarC = ksk0Var.c.c();
                x6h1VarC.i.add(new a7h1("support_site_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", "https://support.spotify.com/article/managed-accounts-for-premium-family/")), x6h1VarC.a(), ksk0Var.b, System.currentTimeMillis()), (xj61) null);
                Uri uri = Uri.parse("https://support.spotify.com/article/managed-accounts-for-premium-family/");
                oxg1 oxg1Var = new oxg1();
                ((asn) oxg1Var.d).a = -16777216;
                oxg1Var.g();
                oxg1Var.a().j(((ConstraintLayout) ((ur00) co6Var.f).b).getContext(), uri);
                break;
            case 3:
                iu30 event$src_main_java_com_spotify_creativeworkplatform_encore_encore = ((str) ((xap) obj).b).getEvent$src_main_java_com_spotify_creativeworkplatform_encore_encore();
                if (event$src_main_java_com_spotify_creativeworkplatform_encore_encore != null) {
                    event$src_main_java_com_spotify_creativeworkplatform_encore_encore.invoke(wdt.a);
                }
                break;
            case 4:
                ((PromptCreationHeaderView) obj).X0.invoke();
                break;
            case 5:
                ((fvx0) obj).e.accept(msx0.a);
                break;
            default:
                ((sj21) obj).b.accept(ni21.a);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 1:
                textPaint.setColor(((Context) this.b).getColor(R.color.white));
                textPaint.setUnderlineText(true);
                break;
            case 2:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(true);
                break;
            case 3:
                textPaint.setColor(textPaint.linkColor);
                textPaint.setUnderlineText(false);
                textPaint.setTypeface(Typeface.create(textPaint.getTypeface(), 1));
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public /* synthetic */ ntj(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public ntj(mjc0 mjc0Var) {
        this.a = (byte) 0;
        this.b = mjc0Var;
    }
}
