package p;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class azt implements Function {
    public static final azt b = new azt(0);
    public static final azt c = new azt(1);
    public static final azt d = new azt(2);
    public static final azt e = new azt(3);
    public static final azt f = new azt(4);
    public static final azt g = new azt(5);
    public static final azt h = new azt(6);
    public static final azt i = new azt(7);
    public static final azt j = new azt(8);
    public static final azt k = new azt(9);
    public static final /* synthetic */ azt l = new azt(10);
    public final /* synthetic */ byte a;

    public /* synthetic */ azt(byte b2) {
        this.a = b2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ConcurrentHashMap.newKeySet();
            case 1:
                return mgo1.e(1, 0, 0, 6);
            case 2:
                return mgo1.e(1, 0, 0, 6);
            case 3:
                return mno1.a(-2, 0, 6);
            case 4:
                return mno1.a(-2, 0, 6);
            case 5:
                return gio1.b((Object) null);
            case 6:
                return ygn0.a();
            case 7:
                return ygn0.a();
            case 8:
                return new azg1();
            case 9:
                return new CopyOnWriteArrayList();
            default:
                return new ArrayList();
        }
    }
}
