package p;

import android.view.View;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f1b implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ f1b(Consumer consumer, byte b) {
        this.a = b;
        this.b = consumer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        m5b m5bVar = m5b.a;
        Consumer consumer = this.b;
        switch (b) {
            case 0:
                consumer.accept(zc90.a);
                break;
            case 1:
                consumer.accept(ue10.a);
                break;
            case 2:
                consumer.accept(j5b.a);
                break;
            case 3:
                consumer.accept(m5bVar);
                break;
            case 4:
                consumer.accept(hoh.a);
                break;
            case 5:
                consumer.accept(uzv.a);
                break;
            case 6:
                consumer.accept(cxw.a);
                break;
            case 7:
                consumer.accept(l5b.a);
                break;
            case 8:
                consumer.accept(m5bVar);
                break;
            case 9:
                consumer.accept(m5bVar);
                break;
            case 10:
                consumer.accept(ova0.a);
                break;
            case 11:
                consumer.accept(ojn0.a);
                break;
            case 12:
                consumer.accept(h6s0.a);
                break;
            case 13:
                consumer.accept(m6x0.a);
                break;
            default:
                consumer.accept(new up81());
                break;
        }
    }
}
