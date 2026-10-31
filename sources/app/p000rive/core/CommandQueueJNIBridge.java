package app.p000rive.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\bw\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0096 ¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0096 ¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0016\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0096 ¢\u0006\u0004\b\u0016\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001c\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0096 ¢\u0006\u0004\b\u001c\u0010\u001dJ(\u0010\u001f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\u001f\u0010 J(\u0010!\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b!\u0010 J(\u0010\"\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\"\u0010 J(\u0010$\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b$\u0010 J(\u0010%\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b%\u0010 J0\u0010&\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b&\u0010'J(\u0010(\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b(\u0010 J0\u0010+\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0096 ¢\u0006\u0004\b+\u0010,J0\u0010-\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0096 ¢\u0006\u0004\b-\u0010,J(\u0010.\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b.\u0010 J(\u0010/\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b/\u00100J0\u00102\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u00101\u001a\u00020)H\u0096 ¢\u0006\u0004\b2\u00103J(\u00104\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b4\u0010 J(\u00105\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b5\u00100J0\u00106\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u00101\u001a\u00020)H\u0096 ¢\u0006\u0004\b6\u00103J(\u00108\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b8\u0010 J0\u0010:\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b:\u0010'J \u0010;\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b;\u0010<JH\u0010D\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020=2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020@2\u0006\u0010C\u001a\u00020@H\u0096 ¢\u0006\u0004\bD\u0010EJ0\u0010I\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020FH\u0096 ¢\u0006\u0004\bI\u0010JJ(\u0010K\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0006\u0010G\u001a\u00020FH\u0096 ¢\u0006\u0004\bK\u0010LJ \u0010M\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\bM\u0010<J(\u0010N\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\bN\u0010 J(\u0010O\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\bO\u0010 J(\u0010P\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\bP\u0010 J(\u0010Q\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\bQ\u0010 J(\u0010R\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\bR\u0010 J0\u0010S\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0096 ¢\u0006\u0004\bS\u00103J0\u0010T\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\bT\u0010UJ0\u0010V\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0096 ¢\u0006\u0004\bV\u00103J0\u0010W\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\bW\u0010UJ8\u0010Y\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)2\u0006\u0010X\u001a\u00020)H\u0096 ¢\u0006\u0004\bY\u0010ZJ8\u0010[\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010X\u001a\u00020)H\u0096 ¢\u0006\u0004\b[\u0010\\J0\u0010_\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010^\u001a\u00020)H\u0096 ¢\u0006\u0004\b_\u00103J8\u0010a\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010^\u001a\u00020)2\u0006\u0010`\u001a\u00020FH\u0096 ¢\u0006\u0004\ba\u0010bJ(\u0010c\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\bc\u0010 J(\u0010d\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\bd\u0010 J(\u0010e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\be\u0010 J0\u0010f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\bf\u0010'J(\u0010g\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\bg\u0010 J8\u0010h\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0006\u00101\u001a\u00020)2\u0006\u0010]\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\bh\u0010iJ0\u0010j\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0006\u00101\u001a\u00020)H\u0096 ¢\u0006\u0004\bj\u0010,J(\u0010k\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\bk\u0010 J0\u0010n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010l\u001a\u00020)2\u0006\u0010m\u001a\u00020@H\u0096 ¢\u0006\u0004\bn\u0010oJ0\u0010p\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010l\u001a\u00020)H\u0096 ¢\u0006\u0004\bp\u0010,J0\u0010q\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010l\u001a\u00020)2\u0006\u0010m\u001a\u00020)H\u0096 ¢\u0006\u0004\bq\u0010rJ0\u0010s\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010l\u001a\u00020)H\u0096 ¢\u0006\u0004\bs\u0010,J0\u0010t\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010l\u001a\u00020)2\u0006\u0010m\u001a\u00020\u0012H\u0096 ¢\u0006\u0004\bt\u0010uJ0\u0010v\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010l\u001a\u00020)H\u0096 ¢\u0006\u0004\bv\u0010,J0\u0010w\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010l\u001a\u00020)2\u0006\u0010m\u001a\u00020)H\u0096 ¢\u0006\u0004\bw\u0010rJ0\u0010x\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010l\u001a\u00020)H\u0096 ¢\u0006\u0004\bx\u0010,J0\u0010y\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010l\u001a\u00020)2\u0006\u0010m\u001a\u00020FH\u0096 ¢\u0006\u0004\by\u0010zJ0\u0010{\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010l\u001a\u00020)H\u0096 ¢\u0006\u0004\b{\u0010,J(\u0010|\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010l\u001a\u00020)H\u0096 ¢\u0006\u0004\b|\u0010}J0\u0010\u007f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010l\u001a\u00020)2\u0006\u0010~\u001a\u00020FH\u0096 ¢\u0006\u0004\b\u007f\u0010zJ2\u0010\u0080\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010l\u001a\u00020)2\u0006\u0010~\u001a\u00020FH\u0096 ¢\u0006\u0005\b\u0080\u0001\u0010zJ4\u0010\u0082\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010l\u001a\u00020)2\u0007\u0010\u0081\u0001\u001a\u00020\u0004H\u0096 ¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J4\u0010\u0085\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010l\u001a\u00020)2\u0007\u0010\u0084\u0001\u001a\u00020\u0004H\u0096 ¢\u0006\u0006\b\u0085\u0001\u0010\u0083\u0001J3\u0010\u0086\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010l\u001a\u00020)2\u0006\u0010#\u001a\u00020\u0004H\u0096 ¢\u0006\u0006\b\u0086\u0001\u0010\u0083\u0001J4\u0010\u0088\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010l\u001a\u00020)2\u0007\u0010\u0087\u0001\u001a\u00020\u0004H\u0096 ¢\u0006\u0006\b\u0088\u0001\u0010\u0083\u0001J2\u0010\u0089\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010l\u001a\u00020)H\u0096 ¢\u0006\u0005\b\u0089\u0001\u0010,J<\u0010\u008b\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010l\u001a\u00020)2\u0006\u0010`\u001a\u00020F2\u0007\u0010\u008a\u0001\u001a\u00020\u0004H\u0096 ¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J4\u0010\u008d\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010l\u001a\u00020)2\u0007\u0010\u008a\u0001\u001a\u00020\u0004H\u0096 ¢\u0006\u0006\b\u008d\u0001\u0010\u0083\u0001J2\u0010\u008e\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010l\u001a\u00020)2\u0006\u0010`\u001a\u00020FH\u0096 ¢\u0006\u0005\b\u008e\u0001\u0010zJ4\u0010\u008f\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010l\u001a\u00020)2\u0007\u0010\u008a\u0001\u001a\u00020\u0004H\u0096 ¢\u0006\u0006\b\u008f\u0001\u0010\u0083\u0001J=\u0010\u0092\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010l\u001a\u00020)2\u0007\u0010\u0090\u0001\u001a\u00020F2\u0007\u0010\u0091\u0001\u001a\u00020FH\u0096 ¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J*\u0010\u0094\u0001\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0096 ¢\u0006\u0005\b\u0094\u0001\u0010\u001dJ#\u0010\u0095\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0007\u0010\u0081\u0001\u001a\u00020\u0004H\u0096 ¢\u0006\u0005\b\u0095\u0001\u0010<J,\u0010\u0096\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u00101\u001a\u00020)2\u0007\u0010\u0081\u0001\u001a\u00020\u0004H\u0096 ¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J#\u0010\u0098\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u00101\u001a\u00020)H\u0096 ¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J*\u0010\u009a\u0001\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0096 ¢\u0006\u0005\b\u009a\u0001\u0010\u001dJ#\u0010\u009c\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0007\u0010\u009b\u0001\u001a\u00020\u0004H\u0096 ¢\u0006\u0005\b\u009c\u0001\u0010<J,\u0010\u009d\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u00101\u001a\u00020)2\u0007\u0010\u009b\u0001\u001a\u00020\u0004H\u0096 ¢\u0006\u0006\b\u009d\u0001\u0010\u0097\u0001J#\u0010\u009e\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u00101\u001a\u00020)H\u0096 ¢\u0006\u0006\b\u009e\u0001\u0010\u0099\u0001J*\u0010\u009f\u0001\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0096 ¢\u0006\u0005\b\u009f\u0001\u0010\u001dJ#\u0010 \u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0007\u0010\u0084\u0001\u001a\u00020\u0004H\u0096 ¢\u0006\u0005\b \u0001\u0010<J,\u0010¡\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u00101\u001a\u00020)2\u0007\u0010\u0084\u0001\u001a\u00020\u0004H\u0096 ¢\u0006\u0006\b¡\u0001\u0010\u0097\u0001J#\u0010¢\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u00101\u001a\u00020)H\u0096 ¢\u0006\u0006\b¢\u0001\u0010\u0099\u0001Jg\u0010§\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020=2\u0007\u0010£\u0001\u001a\u00020@2\u0006\u0010B\u001a\u00020@2\u0006\u0010C\u001a\u00020@2\u0007\u0010¤\u0001\u001a\u00020F2\u0007\u0010¥\u0001\u001a\u00020@2\u0007\u0010¦\u0001\u001a\u00020@H\u0096 ¢\u0006\u0006\b§\u0001\u0010¨\u0001Jg\u0010©\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020=2\u0007\u0010£\u0001\u001a\u00020@2\u0006\u0010B\u001a\u00020@2\u0006\u0010C\u001a\u00020@2\u0007\u0010¤\u0001\u001a\u00020F2\u0007\u0010¥\u0001\u001a\u00020@2\u0007\u0010¦\u0001\u001a\u00020@H\u0096 ¢\u0006\u0006\b©\u0001\u0010¨\u0001Jg\u0010ª\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020=2\u0007\u0010£\u0001\u001a\u00020@2\u0006\u0010B\u001a\u00020@2\u0006\u0010C\u001a\u00020@2\u0007\u0010¤\u0001\u001a\u00020F2\u0007\u0010¥\u0001\u001a\u00020@2\u0007\u0010¦\u0001\u001a\u00020@H\u0096 ¢\u0006\u0006\bª\u0001\u0010¨\u0001Jg\u0010«\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020=2\u0007\u0010£\u0001\u001a\u00020@2\u0006\u0010B\u001a\u00020@2\u0006\u0010C\u001a\u00020@2\u0007\u0010¤\u0001\u001a\u00020F2\u0007\u0010¥\u0001\u001a\u00020@2\u0007\u0010¦\u0001\u001a\u00020@H\u0096 ¢\u0006\u0006\b«\u0001\u0010¨\u0001J=\u0010®\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0007\u0010¬\u0001\u001a\u00020F2\u0007\u0010\u00ad\u0001\u001a\u00020F2\u0006\u0010A\u001a\u00020@H\u0096 ¢\u0006\u0006\b®\u0001\u0010¯\u0001J\"\u0010°\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004H\u0096 ¢\u0006\u0005\b°\u0001\u0010<J4\u0010²\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0007\u0010±\u0001\u001a\u00020@H\u0096 ¢\u0006\u0006\b²\u0001\u0010³\u0001J\u001a\u0010´\u0001\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0096 ¢\u0006\u0005\b´\u0001\u0010\u0007Jx\u0010¸\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0007\u0010µ\u0001\u001a\u00020\u00042\u0007\u0010¶\u0001\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0007\u0010¬\u0001\u001a\u00020F2\u0007\u0010\u00ad\u0001\u001a\u00020F2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020=2\u0006\u0010A\u001a\u00020@2\u0007\u0010·\u0001\u001a\u00020FH\u0096 ¢\u0006\u0006\b¸\u0001\u0010¹\u0001J#\u0010º\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0007\u0010¶\u0001\u001a\u00020\u0004H\u0096 ¢\u0006\u0005\bº\u0001\u0010<J\u0081\u0001\u0010¼\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0007\u0010µ\u0001\u001a\u00020\u00042\u0007\u0010¶\u0001\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0007\u0010¬\u0001\u001a\u00020F2\u0007\u0010\u00ad\u0001\u001a\u00020F2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020=2\u0006\u0010A\u001a\u00020@2\u0007\u0010·\u0001\u001a\u00020F2\u0007\u0010»\u0001\u001a\u00020\u001aH\u0096 ¢\u0006\u0006\b¼\u0001\u0010½\u0001J+\u0010À\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u000e\u0010¿\u0001\u001a\t\u0012\u0004\u0012\u00020\t0¾\u0001H\u0096 ¢\u0006\u0006\bÀ\u0001\u0010Á\u0001¨\u0006Â\u0001"}, d2 = {"Lapp/rive/core/CommandQueueJNIBridge;", "Lapp/rive/core/CommandQueueBridge;", "<init>", "()V", "", "renderContextPointer", "cppConstructor", "(J)J", "pointer", "Lp/rih1;", "cppDelete", "(J)V", "Lapp/rive/core/CommandQueue;", "receiver", "Lapp/rive/core/Listeners;", "cppCreateListeners", "(JLapp/rive/core/CommandQueue;)Lapp/rive/core/Listeners;", "cppPollMessages", "", "enabled", "cppSetTracingEnabled", "(JZ)V", "cppSetDeferredEnabled", "isCurrentThreadCommandServer", "(J)Z", "requestID", "", "bytes", "cppLoadFile", "(JJ[B)J", "fileHandle", "cppDeleteFile", "(JJJ)V", "cppGetArtboardNames", "cppGetFileAssets", "artboardHandle", "cppGetStateMachineNames", "cppGetArtboardVolume", "cppGetDefaultViewModelInfo", "(JJJJ)V", "cppGetViewModelNames", "", "viewModelName", "cppGetViewModelInstanceNames", "(JJJLjava/lang/String;)V", "cppGetViewModelProperties", "cppGetEnums", "cppCreateDefaultArtboard", "(JJJ)J", "name", "cppCreateArtboardByName", "(JJJLjava/lang/String;)J", "cppDeleteArtboard", "cppCreateDefaultStateMachine", "cppCreateStateMachineByName", "stateMachineHandle", "cppDeleteStateMachine", "deltaTimeNs", "cppAdvanceStateMachine", "cppEnableSemantics", "(JJ)V", "", "fit", "alignment", "", "scaleFactor", "surfaceWidth", "surfaceHeight", "cppDrainSemanticsDiff", "(JJBBFFF)V", "", "semanticNodeID", "actionType", "cppFireSemanticAction", "(JJII)V", "cppRequestSemanticFocus", "(JJI)V", "cppClearSemanticFocus", "cppFocusNext", "cppFocusPrevious", "cppClearFocus", "cppRequestFocusState", "cppRequestHasFocusNodes", "cppNamedVMCreateBlankVMI", "cppDefaultVMCreateBlankVMI", "(JJJJ)J", "cppNamedVMCreateDefaultVMI", "cppDefaultVMCreateDefaultVMI", "instanceName", "cppNamedVMCreateNamedVMI", "(JJJLjava/lang/String;Ljava/lang/String;)J", "cppDefaultVMCreateNamedVMI", "(JJJJLjava/lang/String;)J", "viewModelInstanceHandle", "path", "cppReferenceNestedVMI", "index", "cppReferenceListItemVMI", "(JJJLjava/lang/String;I)J", "cppGetViewModelInstanceViewModelName", "cppGetViewModelInstanceName", "cppDeleteViewModelInstance", "cppSetMainViewModelInstance", "cppClearMainViewModelInstance", "cppSetGlobalViewModelInstance", "(JJJLjava/lang/String;J)V", "cppClearGlobalViewModelInstance", "cppBind", "propertyPath", "value", "cppSetNumberProperty", "(JJLjava/lang/String;F)V", "cppGetNumberProperty", "cppSetStringProperty", "(JJLjava/lang/String;Ljava/lang/String;)V", "cppGetStringProperty", "cppSetBooleanProperty", "(JJLjava/lang/String;Z)V", "cppGetBooleanProperty", "cppSetEnumProperty", "cppGetEnumProperty", "cppSetColorProperty", "(JJLjava/lang/String;I)V", "cppGetColorProperty", "cppFireTriggerProperty", "(JJLjava/lang/String;)V", "propertyType", "cppSubscribeToProperty", "cppUnsubscribeFromProperty", "imageHandle", "cppSetImageProperty", "(JJLjava/lang/String;J)V", "fontHandle", "cppSetFontProperty", "cppSetArtboardProperty", "valueHandle", "cppSetViewModelInstanceProperty", "cppGetListSize", "itemHandle", "cppInsertToListAtIndex", "(JJLjava/lang/String;IJ)V", "cppAppendToList", "cppRemoveFromListAtIndex", "cppRemoveFromList", "indexA", "indexB", "cppSwapListItems", "(JJLjava/lang/String;II)V", "cppDecodeImage", "cppDeleteImage", "cppRegisterImage", "(JLjava/lang/String;J)V", "cppUnregisterImage", "(JLjava/lang/String;)V", "cppDecodeAudio", "audioHandle", "cppDeleteAudio", "cppRegisterAudio", "cppUnregisterAudio", "cppDecodeFont", "cppDeleteFont", "cppRegisterFont", "cppUnregisterFont", "layoutScale", "pointerID", "x", "y", "cppPointerMove", "(JJBBFFFIFF)V", "cppPointerDown", "cppPointerUp", "cppPointerExit", "width", "height", "cppResizeArtboard", "(JJIIF)V", "cppResetArtboardSize", "volume", "cppSetArtboardVolume", "(JJJF)V", "cppCreateDrawKey", "surfaceNativePointer", "drawKey", "clearColor", "cppDraw", "(JJJJJJIIBBFI)V", "cppCancelDraw", "buffer", "cppDrawToBuffer", "(JJJJJJIIBBFI[B)V", "Lkotlin/Function0;", "work", "cppRunOnCommandServer", "(JLkotlin/jvm/functions/Function0;)V", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CommandQueueJNIBridge implements CommandQueueBridge {
    public static final int $stable = 0;

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppAdvanceStateMachine(long pointer, long requestID, long stateMachineHandle, long deltaTimeNs);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppAppendToList(long pointer, long viewModelInstanceHandle, String propertyPath, long itemHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppBind(long pointer, long requestID, long stateMachineHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppCancelDraw(long pointer, long drawKey);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppClearFocus(long pointer, long stateMachineHandle, long requestID);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppClearGlobalViewModelInstance(long pointer, long requestID, long stateMachineHandle, String name);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppClearMainViewModelInstance(long pointer, long requestID, long stateMachineHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppClearSemanticFocus(long pointer, long stateMachineHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native long cppConstructor(long renderContextPointer);

    @Override // app.p000rive.core.CommandQueueBridge
    public native long cppCreateArtboardByName(long pointer, long requestID, long fileHandle, String name);

    @Override // app.p000rive.core.CommandQueueBridge
    public native long cppCreateDefaultArtboard(long pointer, long requestID, long fileHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native long cppCreateDefaultStateMachine(long pointer, long requestID, long artboardHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native long cppCreateDrawKey(long pointer);

    @Override // app.p000rive.core.CommandQueueBridge
    public native Listeners cppCreateListeners(long pointer, CommandQueue receiver);

    @Override // app.p000rive.core.CommandQueueBridge
    public native long cppCreateStateMachineByName(long pointer, long requestID, long artboardHandle, String name);

    @Override // app.p000rive.core.CommandQueueBridge
    public native long cppDecodeAudio(long pointer, long requestID, byte[] bytes);

    @Override // app.p000rive.core.CommandQueueBridge
    public native long cppDecodeFont(long pointer, long requestID, byte[] bytes);

    @Override // app.p000rive.core.CommandQueueBridge
    public native long cppDecodeImage(long pointer, long requestID, byte[] bytes);

    @Override // app.p000rive.core.CommandQueueBridge
    public native long cppDefaultVMCreateBlankVMI(long pointer, long requestID, long fileHandle, long artboardHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native long cppDefaultVMCreateDefaultVMI(long pointer, long requestID, long fileHandle, long artboardHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native long cppDefaultVMCreateNamedVMI(long pointer, long requestID, long fileHandle, long artboardHandle, String instanceName);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppDelete(long pointer);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppDeleteArtboard(long pointer, long requestID, long artboardHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppDeleteAudio(long pointer, long audioHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppDeleteFile(long pointer, long requestID, long fileHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppDeleteFont(long pointer, long fontHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppDeleteImage(long pointer, long imageHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppDeleteStateMachine(long pointer, long requestID, long stateMachineHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppDeleteViewModelInstance(long pointer, long requestID, long viewModelInstanceHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppDrainSemanticsDiff(long pointer, long stateMachineHandle, byte fit, byte alignment, float scaleFactor, float surfaceWidth, float surfaceHeight);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppDraw(long pointer, long renderContextPointer, long surfaceNativePointer, long drawKey, long artboardHandle, long stateMachineHandle, int width, int height, byte fit, byte alignment, float scaleFactor, int clearColor);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppDrawToBuffer(long pointer, long renderContextPointer, long surfaceNativePointer, long drawKey, long artboardHandle, long stateMachineHandle, int width, int height, byte fit, byte alignment, float scaleFactor, int clearColor, byte[] buffer);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppEnableSemantics(long pointer, long stateMachineHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppFireSemanticAction(long pointer, long stateMachineHandle, int semanticNodeID, int actionType);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppFireTriggerProperty(long pointer, long viewModelInstanceHandle, String propertyPath);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppFocusNext(long pointer, long stateMachineHandle, long requestID);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppFocusPrevious(long pointer, long stateMachineHandle, long requestID);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppGetArtboardNames(long pointer, long requestID, long fileHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppGetArtboardVolume(long pointer, long requestID, long artboardHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppGetBooleanProperty(long pointer, long requestID, long viewModelInstanceHandle, String propertyPath);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppGetColorProperty(long pointer, long requestID, long viewModelInstanceHandle, String propertyPath);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppGetDefaultViewModelInfo(long pointer, long requestID, long fileHandle, long artboardHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppGetEnumProperty(long pointer, long requestID, long viewModelInstanceHandle, String propertyPath);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppGetEnums(long pointer, long requestID, long fileHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppGetFileAssets(long pointer, long requestID, long fileHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppGetListSize(long pointer, long requestID, long viewModelInstanceHandle, String propertyPath);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppGetNumberProperty(long pointer, long requestID, long viewModelInstanceHandle, String propertyPath);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppGetStateMachineNames(long pointer, long requestID, long artboardHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppGetStringProperty(long pointer, long requestID, long viewModelInstanceHandle, String propertyPath);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppGetViewModelInstanceName(long pointer, long requestID, long viewModelInstanceHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppGetViewModelInstanceNames(long pointer, long requestID, long fileHandle, String viewModelName);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppGetViewModelInstanceViewModelName(long pointer, long requestID, long viewModelInstanceHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppGetViewModelNames(long pointer, long requestID, long fileHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppGetViewModelProperties(long pointer, long requestID, long fileHandle, String viewModelName);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppInsertToListAtIndex(long pointer, long viewModelInstanceHandle, String propertyPath, int index, long itemHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native long cppLoadFile(long pointer, long requestID, byte[] bytes);

    @Override // app.p000rive.core.CommandQueueBridge
    public native long cppNamedVMCreateBlankVMI(long pointer, long requestID, long fileHandle, String viewModelName);

    @Override // app.p000rive.core.CommandQueueBridge
    public native long cppNamedVMCreateDefaultVMI(long pointer, long requestID, long fileHandle, String viewModelName);

    @Override // app.p000rive.core.CommandQueueBridge
    public native long cppNamedVMCreateNamedVMI(long pointer, long requestID, long fileHandle, String viewModelName, String instanceName);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppPointerDown(long pointer, long stateMachineHandle, byte fit, byte alignment, float layoutScale, float surfaceWidth, float surfaceHeight, int pointerID, float x, float y);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppPointerExit(long pointer, long stateMachineHandle, byte fit, byte alignment, float layoutScale, float surfaceWidth, float surfaceHeight, int pointerID, float x, float y);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppPointerMove(long pointer, long stateMachineHandle, byte fit, byte alignment, float layoutScale, float surfaceWidth, float surfaceHeight, int pointerID, float x, float y);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppPointerUp(long pointer, long stateMachineHandle, byte fit, byte alignment, float layoutScale, float surfaceWidth, float surfaceHeight, int pointerID, float x, float y);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppPollMessages(long pointer);

    @Override // app.p000rive.core.CommandQueueBridge
    public native long cppReferenceListItemVMI(long pointer, long requestID, long viewModelInstanceHandle, String path, int index);

    @Override // app.p000rive.core.CommandQueueBridge
    public native long cppReferenceNestedVMI(long pointer, long requestID, long viewModelInstanceHandle, String path);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppRegisterAudio(long pointer, String name, long audioHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppRegisterFont(long pointer, String name, long fontHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppRegisterImage(long pointer, String name, long imageHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppRemoveFromList(long pointer, long viewModelInstanceHandle, String propertyPath, long itemHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppRemoveFromListAtIndex(long pointer, long viewModelInstanceHandle, String propertyPath, int index);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppRequestFocusState(long pointer, long stateMachineHandle, long requestID);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppRequestHasFocusNodes(long pointer, long stateMachineHandle, long requestID);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppRequestSemanticFocus(long pointer, long stateMachineHandle, int semanticNodeID);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppResetArtboardSize(long pointer, long artboardHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppResizeArtboard(long pointer, long artboardHandle, int width, int height, float scaleFactor);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppRunOnCommandServer(long pointer, Function0 work);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppSetArtboardProperty(long pointer, long viewModelInstanceHandle, String propertyPath, long artboardHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppSetArtboardVolume(long pointer, long requestID, long artboardHandle, float volume);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppSetBooleanProperty(long pointer, long viewModelInstanceHandle, String propertyPath, boolean value);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppSetColorProperty(long pointer, long viewModelInstanceHandle, String propertyPath, int value);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppSetDeferredEnabled(long pointer, boolean enabled);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppSetEnumProperty(long pointer, long viewModelInstanceHandle, String propertyPath, String value);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppSetFontProperty(long pointer, long viewModelInstanceHandle, String propertyPath, long fontHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppSetGlobalViewModelInstance(long pointer, long requestID, long stateMachineHandle, String name, long viewModelInstanceHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppSetImageProperty(long pointer, long viewModelInstanceHandle, String propertyPath, long imageHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppSetMainViewModelInstance(long pointer, long requestID, long stateMachineHandle, long viewModelInstanceHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppSetNumberProperty(long pointer, long viewModelInstanceHandle, String propertyPath, float value);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppSetStringProperty(long pointer, long viewModelInstanceHandle, String propertyPath, String value);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppSetTracingEnabled(long pointer, boolean enabled);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppSetViewModelInstanceProperty(long pointer, long viewModelInstanceHandle, String propertyPath, long valueHandle);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppSubscribeToProperty(long pointer, long viewModelInstanceHandle, String propertyPath, int propertyType);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppSwapListItems(long pointer, long viewModelInstanceHandle, String propertyPath, int indexA, int indexB);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppUnregisterAudio(long pointer, String name);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppUnregisterFont(long pointer, String name);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppUnregisterImage(long pointer, String name);

    @Override // app.p000rive.core.CommandQueueBridge
    public native void cppUnsubscribeFromProperty(long pointer, long viewModelInstanceHandle, String propertyPath, int propertyType);

    @Override // app.p000rive.core.CommandQueueBridge
    public native boolean isCurrentThreadCommandServer(long pointer);
}
