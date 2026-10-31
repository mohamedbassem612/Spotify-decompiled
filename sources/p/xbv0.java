package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.podcastinteractivity.polls.proto.ClientPollResponse;
import com.spotify.music.podcastinteractivity.polls.proto.Poll;
import com.spotify.music.podcastinteractivity.polls.proto.PollOption;
import j$.time.Clock;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xbv0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jqd0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xbv0(jqd0 jqd0Var, byte b) {
        super(1);
        this.a = b;
        this.b = jqd0Var;
    }

    public final Object invoke(Object obj) {
        int i;
        ClientPollResponse clientPollResponse;
        String string;
        byte b = this.a;
        jqd0 jqd0Var = this.b;
        switch (b) {
            case 0:
                b2c b2cVar = (b2c) jqd0Var.d;
                kcv0 kcv0Var = ((tbv0) obj).a;
                boolean z = b2cVar.b;
                int iC = l1d.C(b2cVar.a);
                int i2 = iC != 0 ? iC != 1 ? 0 : 2 : 1;
                if (kcv0Var instanceof icv0) {
                    return new zav0();
                }
                if (kcv0Var instanceof jcv0) {
                    return new abv0(i2, z);
                }
                if (kcv0Var instanceof kcv0) {
                    kcv0 kcv0Var2 = kcv0Var;
                    Context context = (Context) b2cVar.c;
                    ClientPollResponse clientPollResponse2 = kcv0Var2.c;
                    Poll pollO = clientPollResponse2.o();
                    ArrayList arrayList = new ArrayList();
                    int iP = 0;
                    for (PollOption pollOption : pollO.r()) {
                        iP += pollOption.p();
                        arrayList.add(new ibv0(pollOption.n(), pollOption.o(), pollOption.p()));
                    }
                    int i3 = ybv0.a[pollO.v().ordinal()];
                    if (i3 == -1) {
                        i = 0;
                    } else if (i3 == 1) {
                        i = 2;
                    } else if (i3 != 2) {
                        if (i3 != 3) {
                            eg.o();
                        }
                        i = 0;
                    } else {
                        i = 1;
                    }
                    mcv0 mcv0Var = (mcv0) b2cVar.d;
                    String strN = pollO.n();
                    Resources resources = context.getResources();
                    DateTimeFormatter dateTimeFormatter = mcv0.b;
                    LocalDateTime localDateTime = LocalDateTime.parse(strN, dateTimeFormatter);
                    Clock clock = mcv0Var.a;
                    if (localDateTime.isBefore(LocalDateTime.now(clock))) {
                        string = resources.getString(2131960198);
                        clientPollResponse = clientPollResponse2;
                    } else {
                        LocalDateTime localDateTime2 = LocalDateTime.parse(strN, dateTimeFormatter);
                        LocalDateTime localDateTimeNow = LocalDateTime.now(clock);
                        LocalDateTime localDateTimeFrom = LocalDateTime.from(localDateTime2);
                        clientPollResponse = clientPollResponse2;
                        int iAbs = (int) Math.abs(localDateTimeFrom.until(localDateTimeNow, ChronoUnit.DAYS));
                        LocalDateTime localDateTimeMinusDays = localDateTimeFrom.minusDays(iAbs);
                        int iAbs2 = (int) Math.abs(localDateTimeMinusDays.until(localDateTimeNow, ChronoUnit.HOURS));
                        if (iAbs == 0 && iAbs2 == 0) {
                            int iAbs3 = (int) Math.abs(localDateTimeMinusDays.until(localDateTimeNow, ChronoUnit.MINUTES));
                            string = resources.getQuantityString(2131820853, iAbs3, Integer.valueOf(iAbs3));
                            string.getClass();
                        } else if (iAbs == 0) {
                            string = resources.getQuantityString(2131820852, iAbs2, Integer.valueOf(iAbs2));
                        } else {
                            string = resources.getString(2131960204, resources.getQuantityString(2131820851, iAbs, Integer.valueOf(iAbs)), resources.getQuantityString(2131820852, iAbs2, Integer.valueOf(iAbs2)));
                            string.getClass();
                        }
                    }
                    String quantityString = context.getResources().getQuantityString(2131820854, iP, Integer.valueOf(iP), string);
                    ClientPollResponse clientPollResponse3 = clientPollResponse;
                    return new fbv0(pollO.t(), quantityString, pollO.getEntityUri(), i, arrayList, clientPollResponse3.p(), pollO.u() == zbv0.LIVE, iP, clientPollResponse3.o().p().o(), kcv0Var2.d, kcv0Var2.f, kcv0Var2.g, i2, b2cVar.b);
                }
                int i4 = i2;
                if (kcv0Var instanceof lcv0) {
                    return new hbv0(i4, z, ((lcv0) kcv0Var).d);
                }
                eg.o();
                return null;
            default:
                qzh qzhVarA = ((hjc) jqd0Var.c).a((l0i) null);
                tps tpsVar = (tps) qzhVarA;
                View view = tpsVar.getView();
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                if (jqd0Var.b) {
                    int dimensionPixelSize = tpsVar.getView().getContext().getResources().getDimensionPixelSize(2131165413);
                    marginLayoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                }
                view.setLayoutParams(marginLayoutParams);
                return qzhVarA;
        }
    }
}
