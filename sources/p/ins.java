package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ins implements bs41 {
    public final /* synthetic */ jns a;

    public ins(jns jnsVar) {
        this.a = jnsVar;
    }

    @Override // p.bs41
    public final float f(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        jns jnsVar = this.a;
        float fFloatValue = ((Number) jnsVar.a.invoke(Float.valueOf(f))).floatValue();
        jnsVar.e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        jnsVar.f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
