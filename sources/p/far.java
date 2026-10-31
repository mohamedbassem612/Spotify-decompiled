package p;

import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class far {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = this.i;
        int i10 = this.j;
        long j = this.k;
        int i11 = this.l;
        String str = zoi1.a;
        Locale locale = Locale.US;
        StringBuilder sbQ = cy30.q(i, i2, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        ktd.p(i3, i4, "\n skippedInputBuffers=", "\n renderedOutputBuffers=", sbQ);
        ktd.p(i5, i6, "\n skippedOutputBuffers=", "\n droppedBuffers=", sbQ);
        ktd.p(i7, i8, "\n droppedInputBuffers=", "\n maxConsecutiveDroppedBuffers=", sbQ);
        ktd.p(i9, i10, "\n droppedToKeyframeEvents=", "\n totalVideoFrameProcessingOffsetUs=", sbQ);
        sbQ.append(j);
        sbQ.append("\n videoFrameProcessingOffsetCount=");
        sbQ.append(i11);
        sbQ.append("\n}");
        return sbQ.toString();
    }
}
