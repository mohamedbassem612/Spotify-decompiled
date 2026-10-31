package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class xu2 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ xu2(Consumer consumer, byte b) {
        this.a = b;
        this.b = consumer;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        Consumer consumer = this.b;
        switch (b) {
            case 0:
                consumer.accept((q3f) obj);
                break;
            case 1:
                consumer.accept((q3f) obj);
                break;
            case 2:
                consumer.accept((q3f) obj);
                break;
            case 3:
                consumer.accept((vue) obj);
                break;
            case 4:
                consumer.accept((vue) obj);
                break;
            case 5:
                consumer.accept((k9f) obj);
                break;
            case 6:
                consumer.accept((k9f) obj);
                break;
            case 7:
                consumer.accept((q3f) obj);
                break;
            case 8:
                qkk qkkVar = (vlk) obj;
                if (qkkVar instanceof qkk) {
                    qkk qkkVar2 = qkkVar;
                    consumer.accept(new h800(qkkVar2.a, qkkVar2.b));
                } else if (qkkVar instanceof pkk) {
                    pkk pkkVar = (pkk) qkkVar;
                    consumer.accept(new g800(pkkVar.a, pkkVar.b));
                } else if (qkkVar instanceof rkk) {
                    rkk rkkVar = (rkk) qkkVar;
                    consumer.accept(new i800(rkkVar.b, rkkVar.a, rkkVar.c));
                }
                break;
            case 9:
                consumer.accept((q3f) obj);
                break;
            case 10:
                consumer.accept((q3f) obj);
                break;
            case 11:
                consumer.accept((q3f) obj);
                break;
            case 12:
                consumer.accept(new w9m1(obj, (tqw) null));
                break;
            case 13:
                consumer.accept(obj);
                break;
            case 14:
                consumer.accept(obj);
                break;
            case 15:
                consumer.accept((q3f) obj);
                break;
            case 16:
                consumer.accept((q3f) obj);
                break;
            case 17:
                consumer.accept((i901) obj);
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                consumer.accept((kzw0) obj);
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                consumer.accept((bcg1) obj);
                break;
            case 20:
                consumer.accept((bq61) obj);
                break;
            case 21:
                consumer.accept((vx71) obj);
                break;
            case 22:
                consumer.accept((vx71) obj);
                break;
            case 23:
                consumer.accept(new kp81((sh2) obj));
                break;
            case 24:
                consumer.accept(new rp81((gxw) obj));
                break;
            case 25:
                consumer.accept(new tp81((zc40) obj));
                break;
            case 26:
                consumer.accept(new xp81((qjn0) obj));
                break;
            case 27:
                consumer.accept(new yp81((j6s0) obj));
                break;
            default:
                consumer.accept((ky51) obj);
                break;
        }
    }
}
