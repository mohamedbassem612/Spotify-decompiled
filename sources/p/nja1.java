package p;

import android.os.Parcelable;
import com.spotify.scrollsita.v1.Section;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nja1 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ nja1(byte b) {
        this.a = b;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v31 p.qcb1, still in use, count: 1, list:
          (r3v31 p.qcb1) from 0x01b5: MOVE (r0v34 p.qcb1) = (r3v31 p.qcb1) (LINE:438)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r23) {
        /*
            Method dump skipped, instruction units count: 1034
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.nja1.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new oja1[i];
            case 1:
                return new tja1[i];
            case 2:
                return new cka1[i];
            case 3:
                return new eka1[i];
            case 4:
                return new dka1[i];
            case 5:
                return new ela1[i];
            case 6:
                return new aua1[i];
            case 7:
                return new bua1[i];
            case 8:
                return new cua1[i];
            case 9:
                return new wua1[i];
            case 10:
                return new xua1[i];
            case 11:
                return new fya1[i];
            case 12:
                return new c3b1[i];
            case 13:
                return new d3b1[i];
            case 14:
                return new e3b1[i];
            case 15:
                return new u9b1[i];
            case 16:
                return new y9b1[i];
            case 17:
                return new kab1[i];
            case 18:
                return new lab1[i];
            case 19:
                return new mcb1[i];
            case 20:
                return new qcb1[i];
            case 21:
                return new ncb1[i];
            case 22:
                return new ocb1[i];
            case 23:
                return new ygb1[i];
            case 24:
                return new zgb1[i];
            case 25:
                return new ahb1[i];
            case 26:
                return new fhb1[i];
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new yib1[i];
            case 28:
                return new ajb1[i];
            default:
                return new xjb1[i];
        }
    }
}
