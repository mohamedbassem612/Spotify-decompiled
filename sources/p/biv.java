package p;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class biv extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ div b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public biv(div divVar, onm onmVar) {
        super(onmVar);
        this.b = divVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        div.g(this.b, null, this);
        return d9n.a;
    }
}
