package p;

import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qjk implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qjk(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                vlk vlkVar = (vlk) obj;
                vlkVar.getClass();
                ((iu30) obj2).invoke(vlkVar);
                break;
            case 1:
                ((Consumer) obj2).accept(new w9m1(obj, (tqw) null));
                break;
            case 2:
                obj.getClass();
                ((bpb1) obj2).m(null, obj);
                break;
            default:
                ((sam0) obj2).k.onNext(Boolean.valueOf(((oam0) obj).a instanceof u9m0));
                break;
        }
    }
}
