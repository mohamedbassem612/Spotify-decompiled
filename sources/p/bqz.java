package p;

import com.spotify.prefs.esperanto.proto.EsPrefs;
import com.spotify.prefs.esperanto.proto.EsPrefs$PrefValues;
import com.spotify.prefs.esperanto.proto.EsPrefs$SetParams;
import com.spotify.prefs.esperanto.proto.EsPrefs$SubParams;
import com.spotify.prefs.esperanto.proto.EsPrefs$Value;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bqz {
    public final pov0 a;

    public bqz(pov0 pov0Var) {
        this.a = pov0Var;
    }

    public static EsPrefs$Value a(String str, EsPrefs$PrefValues esPrefs$PrefValues) {
        try {
            EsPrefs$Value esPrefs$ValueP = esPrefs$PrefValues.p(str);
            esPrefs$ValueP.getClass();
            return esPrefs$ValueP;
        } catch (IllegalArgumentException e) {
            n57.g(String.format("Failed to get preference with key %s", Arrays.copyOf(new Object[]{str}, 1)), e);
            EsPrefs$Value esPrefs$ValueO = EsPrefs$Value.o();
            esPrefs$ValueO.getClass();
            return esPrefs$ValueO;
        }
    }

    public final Single b(String str) {
        dqz dqzVarN = EsPrefs.GetParams.n();
        dqzVarN.n(str);
        EsPrefs.GetParams getParamsBuild = dqzVarN.build();
        getParamsBuild.getClass();
        return this.a.callSingle("spotify.prefs.esperanto.proto.Prefs", "Get", getParamsBuild).map(f331.c1).map(new njp1((byte) 8, this, str));
    }

    public final Observable c(String str) {
        hqz hqzVarN = EsPrefs$SubParams.n();
        hqzVarN.n(str);
        EsPrefs$SubParams esPrefs$SubParams = (EsPrefs$SubParams) hqzVarN.build();
        esPrefs$SubParams.getClass();
        return this.a.callStream("spotify.prefs.esperanto.proto.Prefs", "Sub", esPrefs$SubParams).map(sa20.d1).map(new yjp1((byte) 6, this, str));
    }

    public final Completable d(String str, EsPrefs$Value esPrefs$Value) {
        fqz fqzVarP = EsPrefs$SetParams.p();
        fqzVarP.n(str, esPrefs$Value);
        EsPrefs$SetParams esPrefs$SetParams = (EsPrefs$SetParams) fqzVarP.build();
        esPrefs$SetParams.getClass();
        return this.a.callSingle("spotify.prefs.esperanto.proto.Prefs", "Set", esPrefs$SetParams).map(a020.d1).map(new jm(this, str)).flatMapCompletable(new otu(esPrefs$Value, str, (byte) 26));
    }
}
