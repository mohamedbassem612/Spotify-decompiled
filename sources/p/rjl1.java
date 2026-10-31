package p;

import android.os.Handler;
import android.os.Looper;
import androidx.webkit.WebViewStartupException;
import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class rjl1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rjl1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ujl1 ujl1Var = new ujl1((byte) 1);
                ujl1Var.b = new ArrayList();
                ujl1Var.c = new ArrayList();
                ((Consumer) obj).accept(ujl1Var);
                new Handler(Looper.getMainLooper()).post(new ril1((qpj1) obj2, ujl1Var));
                break;
            case 1:
                qpj1 qpj1Var = (qpj1) obj2;
                ujl1 ujl1Var2 = new ujl1((byte) 0);
                ((Consumer) obj).accept(ujl1Var2);
                new Handler(Looper.getMainLooper()).post(new qub1(qpj1Var, ((Integer) ujl1Var2.b) == null ? new WebViewStartupException((String) ujl1Var2.c) : new WebViewStartupException((String) ujl1Var2.c), (byte) 19));
                break;
            default:
                ((BiConsumer) obj).accept(0, ((sjl1) obj2).a);
                break;
        }
    }
}
