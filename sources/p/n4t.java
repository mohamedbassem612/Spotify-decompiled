package p;

import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.CommandOptions$Builder;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n4t implements Function {
    public final /* synthetic */ byte a;
    public long b;

    public n4t(uym0 uym0Var, long j) {
        this.a = (byte) 5;
        this.b = j;
    }

    public long a() {
        return this.b;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                List listA1 = o7h.a1((List) obj, new cvt((byte) 27));
                long j = this.b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listA1) {
                    if (((x3s0) obj2).a() <= j) {
                        arrayList.add(obj2);
                    } else {
                        arrayList2.add(obj2);
                    }
                }
                List listE1 = o7h.e1(1, arrayList);
                ArrayList arrayList3 = new ArrayList(q7h.U(listE1, 10));
                Iterator it = listE1.iterator();
                while (it.hasNext()) {
                    arrayList3.add(k1p1.i((x3s0) it.next(), j));
                }
                return o7h.N0(arrayList2, arrayList3);
            default:
                SeekToCommand.Builder builder = SeekToCommand.builder(this.b);
                CommandOptions$Builder commandOptions$BuilderBuilder = CommandOptions.builder();
                String str = (String) ((spq0) obj).h();
                if (str != null) {
                    commandOptions$BuilderBuilder.getClass();
                    commandOptions$BuilderBuilder.onlyForPlaybackId(str);
                }
                return new j9u0(builder.options(commandOptions$BuilderBuilder.build()).relative(SeekToCommand.Relative.CURRENT).build());
        }
    }

    public /* synthetic */ n4t(byte b, long j) {
        this.a = b;
        this.b = j;
    }
}
