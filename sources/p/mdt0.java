package p;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mdt0 extends a8d1 implements vu30 {
    public xgn0 a;
    public ndt0 b;
    public long c;
    public byte d;
    public /* synthetic */ Object e;
    public final /* synthetic */ CharSequence f;
    public final /* synthetic */ long g;
    public final /* synthetic */ ndt0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdt0(long j, CharSequence charSequence, lnm lnmVar, ndt0 ndt0Var) {
        super(2, lnmVar);
        this.f = charSequence;
        this.g = j;
        this.h = ndt0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        mdt0 mdt0Var = new mdt0(this.g, this.f, lnmVar, this.h);
        mdt0Var.e = obj;
        return mdt0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create(qpp0.j(obj), (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        long j;
        y0e1 y0e1Var;
        ndt0 ndt0Var;
        xgn0 xgn0Var;
        byte b = this.d;
        if (b == 0) {
            hm5.M(obj);
            TextClassifier textClassifierJ = qpp0.j(this.e);
            long j2 = this.g;
            int iG = nbe1.g(j2);
            int iF = nbe1.f(j2);
            CharSequence charSequence = this.f;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence, iG, iF);
            ndt0 ndt0Var2 = this.h;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(ndt0Var2.d());
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifierJ.suggestSelection(defaultLocales.build());
            long jE = e6p1.e(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            d9n d9nVar = d9n.a;
            if (i < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.c = jE;
                this.d = (byte) 2;
                if (ndt0Var2.b(this.f, jE, textClassifierJ, this) != d9nVar) {
                    j = jE;
                }
            } else {
                TextClassification textClassification = textSelectionSuggestSelection.getTextClassification();
                textClassification.getClass();
                y0e1 y0e1VarC = ndt0Var2.c(charSequence, jE, textClassification);
                xgn0 xgn0Var2 = ndt0Var2.e;
                this.e = y0e1VarC;
                this.a = xgn0Var2;
                this.b = ndt0Var2;
                this.c = jE;
                this.d = (byte) 1;
                if (xgn0Var2.a(this) != d9nVar) {
                    y0e1Var = y0e1VarC;
                    ndt0Var = ndt0Var2;
                    xgn0Var = xgn0Var2;
                    j = jE;
                    ndt0Var.g.setValue(y0e1Var);
                }
            }
            return d9nVar;
        }
        if (b == 1) {
            j = this.c;
            ndt0Var = this.b;
            xgn0Var = this.a;
            y0e1Var = (y0e1) this.e;
            hm5.M(obj);
            try {
                ndt0Var.g.setValue(y0e1Var);
            } finally {
                xgn0Var.c((Object) null);
            }
        } else {
            if (b != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.c;
            hm5.M(obj);
        }
        return new nbe1(j);
    }
}
