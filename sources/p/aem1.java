package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class aem1 extends k01 implements vu30 {
    public static final aem1 h = new aem1(2, dem1.class, "shouldDismissPlacesHint", "shouldDismissPlacesHint(F)Z", 5);

    public final Object invoke(Object obj, Object obj2) {
        float fFloatValue = ((Number) obj).floatValue();
        return Boolean.valueOf(Math.abs(fFloatValue) <= Float.MAX_VALUE && Math.abs(fFloatValue) >= 0.1308997f);
    }
}
