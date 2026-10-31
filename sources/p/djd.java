package p;

import android.media.MediaMetadataRetriever;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class djd extends a8d1 implements vu30 {
    public final /* synthetic */ lo9 X;
    public MediaMetadataRetriever a;
    public lo9 b;
    public Collection c;
    public Iterator d;
    public long e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djd(String str, lo9 lo9Var, lnm lnmVar) {
        super(2, lnmVar);
        this.t = str;
        this.X = lo9Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new djd(this.t, this.X, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009d A[Catch: all -> 0x0024, CancellationException -> 0x0027, Exception -> 0x00d7, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0027, Exception -> 0x00d7, blocks: (B:6:0x001d, B:30:0x00c5, B:24:0x0097, B:26:0x009d, B:33:0x00cd, B:32:0x00c9, B:15:0x0039, B:17:0x004b, B:19:0x0053, B:23:0x0074), top: B:43:0x0007, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c9 A[Catch: all -> 0x0024, CancellationException -> 0x0027, Exception -> 0x00d7, TryCatch #3 {CancellationException -> 0x0027, Exception -> 0x00d7, blocks: (B:6:0x001d, B:30:0x00c5, B:24:0x0097, B:26:0x009d, B:33:0x00cd, B:32:0x00c9, B:15:0x0039, B:17:0x004b, B:19:0x0053, B:23:0x0074), top: B:43:0x0007, outer: #0 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c2 -> B:30:0x00c5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.djd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
