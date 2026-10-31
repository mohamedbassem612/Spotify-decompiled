package p;

import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import rxdogtag2.RxDogTag;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class nc80 {
    public static void a() {
        RxDogTag.builder().addIgnoredPackages(new String[]{"com.spotify.mobius"}).install();
        RxJavaPlugins.a = new vrk1((byte) 17);
    }
}
