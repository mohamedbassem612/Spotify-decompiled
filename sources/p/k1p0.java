package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class k1p0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ com.spotify.mobius.functions.Consumer b;

    public /* synthetic */ k1p0(com.spotify.mobius.functions.Consumer consumer, byte b) {
        this.a = b;
        this.b = consumer;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        com.spotify.mobius.functions.Consumer consumer = this.b;
        switch (b) {
            case 0:
                consumer.accept((uu50) obj);
                break;
            case 1:
                consumer.accept((eiw) obj);
                break;
            case 2:
                consumer.accept((t600) obj);
                break;
            case 3:
                consumer.accept((sqv0) obj);
                break;
            case 4:
                consumer.accept((qvx0) obj);
                break;
            case 5:
                consumer.accept((j011) obj);
                break;
            case 6:
                consumer.accept((d211) obj);
                break;
            case 7:
                consumer.accept((lof1) obj);
                break;
            case 8:
                consumer.accept((hd51) obj);
                break;
            case 9:
                consumer.accept((bq61) obj);
                break;
            case 10:
                consumer.accept((eq81) obj);
                break;
            case 11:
                consumer.accept((eq81) obj);
                break;
            default:
                mre1 mre1Var = (mre1) obj;
                mre1Var.getClass();
                consumer.accept(new xue1(mre1Var));
                break;
        }
    }
}
