package p;

import com.spotify.wrapped.v1.proto.AudioPreview;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class ria {
    public static final qia a(AudioPreview.Beats beats) {
        pia piaVar;
        h290<AudioPreview.Beat> h290VarN = beats.n();
        ArrayList arrayList = new ArrayList();
        for (AudioPreview.Beat beat : h290VarN) {
            double dP = beat.p();
            double dN = beat.n();
            if (Math.abs(dP) > Double.MAX_VALUE || dP < 0.0d || dP > 600.0d || Math.abs(dN) > Double.MAX_VALUE || dN <= 0.0d || dN > 600.0d) {
                piaVar = null;
            } else {
                ytw0 ytw0Var = jfv.b;
                ngv ngvVar = ngv.e;
                piaVar = new pia(beat.o(), fdg1.j0(dP, ngvVar), fdg1.j0(dN, ngvVar));
            }
            if (piaVar != null) {
                arrayList.add(piaVar);
            }
        }
        return new qia(arrayList, beats.o(), 2);
    }
}
