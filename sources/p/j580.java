package p;

import androidx.media3.muxer.MuxerException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j580 implements ahn0 {
    public final spm0 a;
    public final yjp1 b;
    public final long c;
    public final LinkedHashSet d = new LinkedHashSet();
    public int e = -1;

    public j580(spm0 spm0Var, yjp1 yjp1Var, long j) {
        this.a = spm0Var;
        this.b = yjp1Var;
        this.c = j;
    }

    @Override // p.ahn0
    public final int H(ie30 ie30Var) {
        spm0 spm0Var = this.a;
        int iH = spm0Var.H(ie30Var);
        if (asj0.o(ie30Var.f66p)) {
            spm0Var.R0(new tpm0(ie30Var.C));
            this.e = iH;
        }
        return iH;
    }

    @Override // p.ahn0
    public final void R0(rij0 rij0Var) {
        if (mth1.C(rij0Var)) {
            this.d.add(rij0Var);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws MuxerException {
        int i;
        long j = this.c;
        if (j != -9223372036854775807L && (i = this.e) != -1) {
            j0(i, ByteBuffer.allocateDirect(0), new qac(0, j, 4));
        }
        LinkedHashSet linkedHashSet = this.d;
        yjp1 yjp1Var = this.b;
        if (yjp1Var != null) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(linkedHashSet);
            linkedHashSet2.clear();
            linkedHashSet2.add(new yeh0("com.spotify.transcode.id", yjp1Var.b.getBytes(nne.a), 0, 1));
            linkedHashSet.clear();
            linkedHashSet.addAll(linkedHashSet2);
        }
        Iterator it = linkedHashSet.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            spm0 spm0Var = this.a;
            if (!zHasNext) {
                spm0Var.close();
                return;
            }
            spm0Var.R0((rij0) it.next());
        }
    }

    @Override // p.ahn0
    public final void j0(int i, ByteBuffer byteBuffer, qac qacVar) throws MuxerException {
        long j = this.c;
        if (j != -9223372036854775807L && i == this.e) {
            long j2 = qacVar.a;
            if (j2 > j) {
                Locale locale = Locale.US;
                StringBuilder sbS = cy30.s(j2, "Skipped sample with presentation time (", ") > video duration (");
                sbS.append(j);
                sbS.append(")");
                oon1.H(sbS.toString());
                return;
            }
        }
        this.a.j0(i, byteBuffer, qacVar);
    }
}
