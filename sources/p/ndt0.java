package p;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import androidx.compose.ui.text.intl.LocaleList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ndt0 implements hdt0 {
    public final o8n a;
    public final Context b;
    public final fw51 c;
    public final LocaleList d;
    public TextClassifier f;
    public final xgn0 e = ygn0.a();
    public final hrr0 g = v8r.q((Object) null);
    public final Object h = new Object();

    public ndt0(o8n o8nVar, Context context, fw51 fw51Var, LocaleList localeList) {
        this.a = o8nVar;
        this.b = context;
        this.c = fw51Var;
        this.d = localeList;
    }

    public final void a(d3e1 d3e1Var, CharSequence charSequence, long j, iu30 iu30Var) {
        xgn0 xgn0Var = this.e;
        y0e1 y0e1Var = null;
        if (xgn0Var.g()) {
            y0e1 y0e1Var2 = (y0e1) this.g.getValue();
            if (y0e1Var2 == null || !nbe1.c(j, y0e1Var2.b) || !u890.j(charSequence, y0e1Var2.a)) {
                y0e1Var2 = null;
            }
            xgn0Var.c((Object) null);
            y0e1Var = y0e1Var2;
        }
        if (y0e1Var == null) {
            iu30Var.invoke(d3e1Var);
            return;
        }
        ArrayList arrayList = y0e1Var.d;
        TextClassification textClassification = y0e1Var.c;
        boolean zIsEmpty = textClassification.getActions().isEmpty();
        Object obj = this.h;
        if (!zIsEmpty) {
            d3e1Var.a.b(new s3e1(obj, textClassification, 0, (Drawable) arrayList.get(0)));
        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
            d3e1Var.a.b(new s3e1(obj, textClassification, -1, textClassification.getIcon()));
        }
        iu30Var.invoke(d3e1Var);
        List<RemoteAction> actions = textClassification.getActions();
        int size = actions.size();
        for (int i = 0; i < size; i++) {
            qpp0.d(actions.get(i));
            if (i > 0) {
                d3e1Var.a.b(new s3e1(obj, textClassification, i, (Drawable) arrayList.get(i)));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(CharSequence charSequence, long j, TextClassifier textClassifier, onm onmVar) {
        idt0 idt0Var;
        long j2;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        vgn0 vgn0Var;
        Object obj;
        Object obj2;
        y0e1 y0e1VarC;
        Object obj3;
        if (onmVar instanceof idt0) {
            idt0Var = (idt0) onmVar;
            int i = idt0Var.g;
            if ((i & os00.INVALID_ID) != 0) {
                idt0Var.g = i - os00.INVALID_ID;
            } else {
                idt0Var = new idt0(this, onmVar);
            }
        } else {
            idt0Var = new idt0(this, onmVar);
        }
        Object obj4 = idt0Var.e;
        int i2 = idt0Var.g;
        hrr0 hrr0Var = this.g;
        rih1 rih1Var = rih1.a;
        vgn0 vgn0Var2 = this.e;
        d9n d9nVar = d9n.a;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        j2 = idt0Var.d;
                        vgn0Var = idt0Var.c;
                        textClassifier2 = (TextClassifier) idt0Var.b;
                        charSequence2 = (CharSequence) idt0Var.a;
                        hm5.M(obj4);
                    } else {
                        if (i2 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vgn0Var2 = (vgn0) idt0Var.b;
                        y0e1VarC = (y0e1) idt0Var.a;
                        hm5.M(obj4);
                        obj3 = null;
                    }
                    hrr0Var.setValue(y0e1VarC);
                    return rih1Var;
                }
                hm5.M(obj4);
                idt0Var.a = charSequence;
                idt0Var.b = textClassifier;
                idt0Var.c = vgn0Var2;
                j2 = j;
                idt0Var.d = j2;
                idt0Var.g = 1;
                if (vgn0Var2.a(idt0Var) == d9nVar) {
                    return d9nVar;
                }
                charSequence2 = charSequence;
                textClassifier2 = textClassifier;
                vgn0Var = vgn0Var2;
                hrr0Var.setValue(y0e1VarC);
                return rih1Var;
            } finally {
                vgn0Var2.c(obj3);
            }
            y0e1 y0e1Var = (y0e1) hrr0Var.getValue();
            if (y0e1Var != null) {
                try {
                    if (nbe1.c(j2, y0e1Var.b) && u890.j(charSequence2, y0e1Var.a)) {
                        vgn0Var.c((Object) null);
                        return rih1Var;
                    }
                    obj2 = null;
                } catch (Throwable th) {
                    th = th;
                    obj = null;
                    vgn0Var.c(obj);
                    throw th;
                }
            } else {
                obj2 = null;
            }
            vgn0Var.c(obj2);
            y0e1VarC = c(charSequence2, j2, textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, nbe1.g(j2), nbe1.f(j2)).setDefaultLocales(d()).build()));
            idt0Var.a = y0e1VarC;
            idt0Var.b = vgn0Var2;
            obj3 = null;
            idt0Var.c = null;
            idt0Var.g = 2;
            if (vgn0Var2.a(idt0Var) == d9nVar) {
                return d9nVar;
            }
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
    }

    public final y0e1 c(CharSequence charSequence, long j, TextClassification textClassification) {
        Icon icon;
        int size = textClassification.getActions().size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            RemoteAction remoteAction = textClassification.getActions().get(i);
            RemoteAction remoteActionD = qpp0.d(remoteAction);
            Drawable drawableLoadDrawable = null;
            if (i != 0 && !remoteActionD.shouldShowIcon()) {
                remoteAction = null;
            }
            RemoteAction remoteActionD2 = qpp0.d(remoteAction);
            if (remoteActionD2 != null && (icon = remoteActionD2.getIcon()) != null) {
                drawableLoadDrawable = icon.loadDrawable(this.b);
            }
            arrayList.add(drawableLoadDrawable);
        }
        return new y0e1(charSequence, j, textClassification, arrayList);
    }

    public final android.os.LocaleList d() {
        LocaleList localeList = this.d;
        if (localeList == null) {
            return new android.os.LocaleList(uct0.a.i().b().a);
        }
        ArrayList arrayList = new ArrayList(q7h.U(localeList, 10));
        Iterator it = localeList.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((ehe0) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new android.os.LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }

    public final Object e(CharSequence charSequence, long j, a8d1 a8d1Var) {
        Object objY;
        int length = charSequence.length();
        rih1 rih1Var = rih1.a;
        if (length == 0 || nbe1.d(j)) {
            objY = rih1Var;
        } else {
            objY = fn31.Y(this.a, new ldt0(this, new jdt0(j, charSequence, null, this), (lnm) null), a8d1Var);
        }
        return objY == d9n.a ? objY : rih1Var;
    }
}
